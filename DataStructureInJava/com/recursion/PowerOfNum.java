package com.recursion;

import java.util.Scanner;

public class PowerOfNum {
	public static int stepcount;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("Power of "+a+" to "+b+" is: "+power(a, b));
		System.out.println(stepcount);
	}

	private static int power(int a, int b) {
		// TODO Auto-generated method stub
		stepcount++;
		if(b == 0) {
			return 1;
		}
		if(b%2==0) {
			return a*power(a*a, b/2);  //// Optimization of steps
		}
		return a*power(a , b-1);
	}
}
