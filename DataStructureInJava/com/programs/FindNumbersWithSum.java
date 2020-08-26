package com.programs;

import java.util.Arrays;
import java.util.Scanner;

public class FindNumbersWithSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int target = sc.nextInt();
		int size = sc.nextInt();
		int arr[] = new int[size];
		for(int i = 0;i<size;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr); // Sort array
		for(int item:arr) {
			System.out.print(item+" ");     // Print items in array
		}
		System.out.println();
		System.out.println(TwoSum(arr , target));
	}
	private static boolean TwoSum(int[] arr , int sum) {
		// TODO Auto-generated method stub
			int j = arr.length-1;
		int i=0;
		while(i<j) {
				if(arr[i]+arr[j]<sum) {
					//System.out.println("Sum< : "+arr[i]+" "+arr[j]);
				    i++;
				}
				else if(arr[i]+arr[j]>sum) {
					//System.out.println("Sum>: "+arr[i]+" "+arr[j]);
					j--;
				}
				else {
					System.out.println("sum ==: "+arr[i]+","+arr[j]);
					return true;
				}
		}
		return false;
	}
}
