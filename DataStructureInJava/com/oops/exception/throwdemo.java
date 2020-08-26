package com.oops.exception;

public class throwdemo {
/*
 * User throws exception explicitly , then throw is used.
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int a = 5;
			int b = 4 ;
			int c = a/b;
			System.out.println(c);
			boolean danger = true;
					if(danger==true) {
						throw new ArrayIndexOutOfBoundsException("Out Of bond");
					};
			
	}

}
