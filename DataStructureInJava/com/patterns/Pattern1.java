package com.patterns;

import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		////// 1st
		
		  for(int i=1;i<=n;i++) { 
			  for(int j = 1;j<=i;j++) { 
				  System.out.print("*"+" ");
		  } 
			  System.out.println(); 
			  } 
		  System.out.println(); 
		  /////// 2nd
		  for(int i=1;i<=n;i++) {
		  for(int j =n;j>=i;j--) { 
			  System.out.print("*"+" "); 
			  } 
		  System.out.println(); }
		  
		 //////  3rd
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=i-1;j++) {
				System.out.print("  ");
			}
			for(int k = 1;k<=n-i+1 ;k++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
		////////// 4th
		for(int i=1;i<=n;i++) {
			for(int j =1;j<=n-i+1;j++) {
				System.out.print("  ");
			}
			for(int k = 0;k<=i-1 ;k++) {
				System.out.print("* ");
			}

			System.out.println();
		
	  }

	}
}
