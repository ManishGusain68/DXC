package com.batch.model;

public class Emp {
	
	private int emd_id;
	private String first_name;
	private String last_name;
	private String email_id;
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Emp(int emd_id, String first_name, String last_name, String email_id) {
		super();
		this.emd_id = emd_id;
		this.first_name = first_name;
		this.last_name = last_name;
		this.email_id = email_id;
	}
	public int getEmd_id() {
		return emd_id;
	}
	public void setEmd_id(int emd_id) {
		this.emd_id = emd_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	@Override
	public String toString() {
		return "Emp [emd_id=" + emd_id + ", first_name=" + first_name + ", last_name=" + last_name + ", email_id="
				+ email_id + "]";
	}
	
	

}
