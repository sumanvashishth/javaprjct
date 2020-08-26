package com.oops.packages.models;

public class Student {
	
	private String name;
	public int age;
	public Student() {
		age = 15;
	}
	public Student(String name){
		this.name = name;
	}
	public String getname() {
		return name;
	}
	private String getpassword() {
		return "kjhhjdgyu@123";
	}
}
