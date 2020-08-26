package com.sort;

import java.util.Scanner;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		int arr[]= new int[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.nextInt();
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		for(int i=0;i<size-1;i++) {
			int minindex = i;
			//boolean swap = true;
			for(int j=i;j<size;j++) {
				if(arr[minindex]>arr[j]) {
					minindex = j;
					//xswap = false;
				}
			}
					int temp =arr[i];
					arr[i]=arr[minindex];
					arr[minindex]=temp;
			}
			for(int item: arr) {
				System.out.print(item+" ");
			}
		}
	}
