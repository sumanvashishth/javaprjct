package com.patterns;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.print("*");
		System.out.println();
		for(int i=2;i<=n-1;i++) {
			   System.out.print("* ");
				for(int k=1;k<=i-2;k++) {
				System.out.print("  ");
				}
				System.out.println("* ");
		}
		if(n>1) {
		for(int i=1;i<=n;i++) {
			System.out.print("* ");
		}
			System.out.println();
		 }
	}
	 }


