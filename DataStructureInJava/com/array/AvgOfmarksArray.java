package com.array;

import java.util.Scanner;

public class AvgOfmarksArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int stdnt = sc.nextInt();
		int marks[] = new int[stdnt];
		double sum =0;
		for(int i=0;i<stdnt;i++) {
			marks[i]=sc.nextInt();
			sum += marks[i];
		}
		System.out.println(sum/stdnt);
		
	}

}
