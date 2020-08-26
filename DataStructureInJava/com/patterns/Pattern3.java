package com.patterns;

import java.util.Scanner;

public class Pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number = 1;
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for(int i=1;i<=n;i++) {
			for(int j=0;j<n-i;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(number++ +"  ");
			}
			System.out.println();
		}
	}

}
