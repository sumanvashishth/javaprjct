package com.oops.exception;

public class ThrowsDemo {
/*
 * When function might throw exception then , Throws is used with method signature.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Waiting");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			System.out.println("This is under finally");
		}
		System.out.println("After delay");
	}

}
