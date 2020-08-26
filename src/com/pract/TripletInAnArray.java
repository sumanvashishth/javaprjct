package com.pract;

public class TripletInAnArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={ 0, -1, 2, -3, 1};
		int sum = -2;
		findtriplet(arr, sum);
	}

	private static void findtriplet(int[] arr, int sum) {
		// TODO Auto-generated method stub
		for(int i=0;i<arr.length-2;i++){
			for(int j = i+1;j<arr.length-1;j++){
				for(int k=j+1;k<arr.length;k++){
					if(arr[i]+arr[j]+arr[k]==sum){
						System.out.print("found: ");
						System.out.print(arr[i]+","+arr[j]+","+arr[k]);	
						System.out.println();
					}
					
				}
			}
		}

		
	}

}
