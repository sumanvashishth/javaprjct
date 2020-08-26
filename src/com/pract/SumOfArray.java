package com.pract;

public class SumOfArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {12 , 18 , 32 , 40 , 16 , 52 ,2 , 5 , 9};
		int target = 34;
		for(int i = 0;i<arr.length-1 ;i++){
			int temp = 0;
			for(int j=i+1;j<arr.length ;j++)
			if(arr[i]>arr[j]){
				temp = arr[i];
				arr[i]= arr[j];
				arr[j] = temp;		
			}	
		}
		int arr1[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			if(arr[i]<target){
				arr1[i]=arr[i];
				System.out.print(arr1[i]+" ");
			}
		}
		System.out.println();
		for(int i=0;i<arr1.length-1;i++){
			for(int j=i+1;j<arr1.length;j++){
				//System.out.println(arr1[i]+" "+arr1[j]);
				if(arr1[i]+arr1[j]==target){
					System.out.println("Found:"+arr1[i]+" "+arr1[j]);	
				}	
			}	
		}
	}
}
