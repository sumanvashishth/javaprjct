package com.basic;

import java.util.Scanner;

public class SeriesSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		float sum = 0;
		for(float i= 1;i<=n;i++) {
			sum += 1/i ;
		}
		System.out.println(sum);
		sum = 0;
		boolean flag = false;
		for(float i = 1; i<=n ; i++) {
			
			  if(i%2==0) { 
				  sum -= 1/i; 
				  } 
			  else { 
				  sum += 1/i; 
				  }
		}
		System.out.println(sum);
	}

}
