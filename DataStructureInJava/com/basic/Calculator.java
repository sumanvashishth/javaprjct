package com.basic;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter numbers: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		sc.nextLine();
		System.out.println("Enter operation: ");
		char op = sc.nextLine().charAt(0);
		int res ;
		switch(op) {
		case '+':
			System.out.println(res = a+b);
			break;
		case '-':
			System.out.println(res = a-b);
			break;
		case '*':
			System.out.println(res = a*b);
			break;
		case '/':
			System.out.println(res = a/b);
			break;
		default:
			System.out.println("Invalid character");
		}
	}

}
