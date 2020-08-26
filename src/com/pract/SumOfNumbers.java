package com.pract;
import java.util.Scanner;

public class SumOfNumbers {
	
	static void finalcount(int R , int S){
		int start = (int) Math.pow(10, R-1);
		int end = (int) Math.pow(10, R)-1 ;
		int count = 0;
		int i = start;
        while(i < end) { 
            int cur = 0; 
            int temp = i; 
         while( temp != 0) { 
        	 cur += temp % 10; 
             temp = temp / 10; 
           }   
         if(cur == S) {
           count++;              
           i += 9;          
       }else {
           i++; 
       }
	  }
     System.out.println("Count is: "+count);
	}	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int S = sc.nextInt();
		finalcount(R , S);
		
	}

}
