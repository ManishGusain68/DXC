package com.example.service;

import java.util.HashMap;
import java.util.*;

import javax.annotation.PostConstruct;

import org.example.users.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {

	Map<String, User> users = new HashMap<>();

	@PostConstruct
	public void initialize() {

		User manish = new User();
		manish.setEmpid(12);
		manish.setName("Manish");
		manish.setSalary(300000);

		User kusuma = new User();
		kusuma.setEmpid(122);
		kusuma.setName("Kusuma");
		kusuma.setSalary(300400);

		User chandana = new User();
		chandana.setEmpid(12);
		chandana.setName("chandana");
		chandana.setSalary(200000);

		users.put(manish.getName(), manish);
		users.put(kusuma.getName(), kusuma);
		users.put(chandana.getName(), chandana);

	}

	public User getUser(String name) {
		System.out.println(users.get(name));

		return users.get(name);

	}

}
