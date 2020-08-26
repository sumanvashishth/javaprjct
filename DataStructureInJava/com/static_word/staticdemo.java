package com.static_word;

import com.static_word.NestedClass.A;
import com.static_word.NestedClass.B;

public class staticdemo {
	static {
		System.out.println("In block 1");
	}
	static {
		System.out.println("In block 2");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("In main function");
		NestedClass nc = new NestedClass();
		A obja = nc.new A();
		
		B objb = new NestedClass.B();
	}
	/*
	 * class person{ // Either make class static or String name as static final. int
	 * age; String name; final static String breed = "Homo Sapiens"; }
	 */

}
class person{
	int age;
	String name;
	static String breed = "Homo Sapiens";
}