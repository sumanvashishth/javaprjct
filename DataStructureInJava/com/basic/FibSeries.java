package com.basic;

import java.util.Scanner;

public class FibSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int range = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.print(a +" "+ b+" ");
		int c ;
		for(int i = 0; i<range-2 ; i++) {
			c = a + b;
			a = b ;
			b = c ;		
			System.out.print(c+" ");
		}
		
	}

}
