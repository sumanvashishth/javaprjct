package com.oops.exception;

public class Stacktrace {
/*
 * Error : Program will stop anyway - e.g. Memory full , I/O error , 
 * Exception : 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		fun();
	}
	static void fun() {
		int a = 5;
		int b = 0;
		int c = a/b;
		System.out.println(c);
	}
}
