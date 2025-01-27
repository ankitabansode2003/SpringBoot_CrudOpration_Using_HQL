package com.spring.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Teacher {

	@Id
	private int t_id;
	private String t_name;
	private String t_department;
	private String t_salary;

	public int getT_id() {
		return t_id;
	}

	public void setT_id(int t_id) {
		this.t_id = t_id;
	}

	public String getT_name() {
		return t_name;
	}

	public void setT_name(String t_name) {
		this.t_name = t_name;
	}

	public String getT_department() {
		return t_department;
	}

	public void setT_department(String t_department) {
		this.t_department = t_department;
	}

	public String getT_salary() {
		return t_salary;
	}

	public void setT_salary(String t_salary) {
		this.t_salary = t_salary;
	}

	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Teacher(int t_id, String t_name, String t_department, String t_salary) {
		super();
		this.t_id = t_id;
		this.t_name = t_name;
		this.t_department = t_department;
		this.t_salary = t_salary;
	}

	@Override
	public String toString() {
		return "Teacher [t_id=" + t_id + ", t_name=" + t_name + ", t_department=" + t_department + ", t_salary="
				+ t_salary + "]";
	}

}
