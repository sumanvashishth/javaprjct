package com.oops.exception;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Program does not stop abruptly when exceptions are handled.
		 */
		try {
			int a = 5;
			int b = 0;
			int c = a/b;
			System.out.println(c);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage()+" Occurred , Please check your code");
		}
		System.out.println("Running after catching exception.");
	}

}
