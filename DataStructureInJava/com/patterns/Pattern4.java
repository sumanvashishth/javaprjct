package com.patterns;

import java.util.Scanner;

public class Pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		for(int i=1;i<=2*n-1;i++) {
			if(i<=n) {
			for(int j=1;j<=i;j++) {
				System.out.print("* ");
			}
			}
			else {
				for(int j=i;j<=2*n-1;j++) {
					System.out.print("* ");
				}
			}
			System.out.println();
		}

		System.out.println();
	}

}
