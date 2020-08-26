package com.oops.encapsulation;

public class Student {

	private int age;
	private String name;
	private int eyes;
	
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		if(age>10) {
			System.out.println("You'r too old to be a nursery student");
		}else
		this.age = age;
	}
}
