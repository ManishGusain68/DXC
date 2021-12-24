package com.batch.config;

import javax.sql.DataSource;

import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.database.BeanPropertyItemSqlParameterSourceProvider;
import org.springframework.batch.item.database.JdbcBatchItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.LineMapper;
import org.springframework.batch.item.file.mapping.BeanWrapperFieldSetMapper;
import org.springframework.batch.item.file.mapping.DefaultLineMapper;
import org.springframework.batch.item.file.transform.DelimitedLineTokenizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import com.batch.model.Emp;

@Configuration
@EnableBatchProcessing
public class BatchConfig {

	@Autowired
	private DataSource datasource;

	@Autowired
	private JobBuilderFactory jobbuilerfactory;

	@Autowired
	private StepBuilderFactory stepbuilderfactory;

	@Bean
	public FlatFileItemReader<Emp> reader() {
		FlatFileItemReader<Emp> reader = new FlatFileItemReader<>();
		reader.setResource(new ClassPathResource("EMP.csv"));
		reader.setLineMapper(getLineMapper());
		reader.setLinesToSkip(1);
		return reader;

	}
	
	private LineMapper<Emp> getLineMapper() {
		DefaultLineMapper<Emp> lineMapper = new DefaultLineMapper<>();
		DelimitedLineTokenizer lineTokenizer = new DelimitedLineTokenizer();
		lineTokenizer.setNames(new String[] { "EMP_ID", "FIRST NAME", "LAST NAME", "EMAIL ID" });
		lineTokenizer.setIncludedFields(new int[] { 0, 1, 2, 4 });
		BeanWrapperFieldSetMapper<Emp> fieldSetMapper = new BeanWrapperFieldSetMapper<>();
		fieldSetMapper.setTargetType(Emp.class);

		lineMapper.setLineTokenizer(lineTokenizer);
		lineMapper.setFieldSetMapper(fieldSetMapper);

		return lineMapper;
	}

	@Bean
	public EmpItemProcessor processor() {
		return new EmpItemProcessor();
	}

	@Bean
	public JdbcBatchItemWriter<Emp> writer() {
		String sql = "insert into emp(emd_id,first_name,last_name,email_id) values (:emd_id,:first_name,:last_name,:email_id)";
		JdbcBatchItemWriter<Emp> writer = new JdbcBatchItemWriter<>();
		writer.setItemSqlParameterSourceProvider(new BeanPropertyItemSqlParameterSourceProvider<>());
		writer.setSql(sql);
		writer.setDataSource(this.datasource);
		return writer;

	}
	
	@Bean
	public Job importEmpJob() {
		return this.jobbuilerfactory.get("EMP-IMPORT-JOB").flow(step1()).end().build();

	}
	@Bean
	public Step step1() {
		return this.stepbuilderfactory.get("step1").<Emp, Emp>chunk(10).reader(reader()).processor(processor())
				.writer(writer()).build();
	}

}
