package easy;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nums[] = {0,1,2,2,3,0,4,2};
		System.out.print("Enter val: ");
		int val = sc.nextInt();
		System.out.println(removeElement(nums, val));
	}
    // Or 2nd solution
	public static int removeElement(int[] nums, int val) {
		int i= 0;
		int n = nums.length;
		while(i<n) {
			if(nums[i]==val) {
				nums[i]=nums[n-1];
				n--;
			}
			else
				i++;
		}	
		return i;
	}
	/*	// 1st Solution
    public static int removeElement(int[] nums, int val) {
       int i =0;
       for(int j= 0;j<nums.length;j++) {
    	   if(nums[j]!=val) {
    		  nums[i]=nums[j]; 
    		  i++;
    	   }
       }	
    	return i;
    }*/
}
