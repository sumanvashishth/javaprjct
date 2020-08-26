package com.pract;
import java.util.Scanner;

public class ConsecutiveiOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int arrlength = sc.nextInt();
		int arr[]=new int[arrlength];
		for(int i=0; i<arrlength;i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("count is "+findMaxConsecutiveOne(arr , arrlength));
	}

	private static int findMaxConsecutiveOne(int[] arr , int length) {
		// TODO Auto-generated method stub
		int count = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<length ;i++){
			if(arr[i] == 1){
				count +=1;
			}
			else{
				count = 0;
			}
			if(max<count){
				System.out.println("count is "+count);
				max = count;
			}
		}
		
		return max;
	}

}
