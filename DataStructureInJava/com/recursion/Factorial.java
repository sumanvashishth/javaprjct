package com.recursion;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println("Factorial of "+num+" is: "+fact(num));
	}

	private static int fact(int num) {
		// TODO Auto-generated method stub
		int fact = 0;
		if(num <= 0) {
			return 0;
		}
		else if(num == 1) {
			return 1;
		}

		return num * fact(num-1);
	}

}
