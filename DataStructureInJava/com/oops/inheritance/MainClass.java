package com.oops.inheritance;

import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class MainClass {

	public static void main(String args[]) {
		Teacher t = new Teacher();
		//Person p = t;   // Upcasting
		Person p = new Person();
		/*
		 * Teacher t1 = (Teacher)p; // Downcasting boolean y = p instanceof Teacher;
		 * System.out.println(y);
		 */
		
		t.name = "Harry";
		p.walk();
		t.teach();
		t.eat();
		Teacher.laughing();
		Singer s = new Singer();
		s.name = "Beyonce";
		s.eat();
		s.walk();
		Singer.laughing();
		
	}
	
}
