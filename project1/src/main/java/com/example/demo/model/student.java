package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class student {
	 @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	private String name;
	private String classname;
	private String division;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String name, String classname, String division) {
		super();
		this.name = name;
		this.classname = classname;
		this.division = division;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", classname=" + classname + ", division=" + division + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClassname() {
		return classname;
	}
	public void setClassname(String classname) {
		this.classname = classname;
	}
	public String getDivision() {
		return division;
	}
	public void setDivision(String division) {
		this.division = division;
	}
	
	
	
	
	
	

}
