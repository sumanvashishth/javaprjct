package com.oops.inheritance;

public class Teacher extends Person {

	public void teach() {
		System.out.println("Mr. "+name+" is teaching");
	}
	public void walk() {
		System.out.println("Teacher Mr. "+name+" is walking");
	}
	/*
	 * public void eat() {
	 * 
	 * System.out.println("Teacher "+name+" is eating"); }
	 */
	public static void laughing() {
		
		System.out.println("Teacher is laughing");
	}
}
