package com.array;

import java.util.Scanner;

public class MetricsAddition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr1[][]= new int[size][size];
		int arr2[][]= new int[size][size];
		int arr3[][]= new int[size][size];
		int num = 1;
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr1[i][j]= num;
				System.out.print(arr1[i][j]+" ");
				num++;
			}
			System.out.println();
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr2[i][j]= num;
				System.out.print(arr2[i][j]+" ");
				num++;
			}
			System.out.println();
		}
		for(int i=0;i<size;i++) {
			for(int j=0;j<size;j++) {
				arr3[i][j]= arr1[i][j]+arr2[i][j];
				System.out.print(arr3[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
