package com.oops.interfaces;

public class Person implements Student , Youtuber {

	public static void main(String[] args) {
		Person p = new Person();
		p.study();
		p.makevideo();
	}
	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Person is studying");
	}

	@Override
	public void makevideo() {
		// TODO Auto-generated method stub
		System.out.println("Person is making video");
	}
	
}
