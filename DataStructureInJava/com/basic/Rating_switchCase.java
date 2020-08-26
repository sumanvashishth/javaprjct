package com.basic;

import java.util.Scanner;

public class Rating_switchCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Rating: ");
		int a = sc.nextInt();
		switch(a) {
		case 1: case 2:
			System.out.println("Bad");
			break;
		case 3:
			System.out.println("avg");
			break;
		case 4: case 5:
			System.out.println("good");
		default:
			System.out.println("Invalid rating");
		}
	}
}
