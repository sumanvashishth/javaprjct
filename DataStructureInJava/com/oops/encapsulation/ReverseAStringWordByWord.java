package com.oops.encapsulation;

import java.util.ArrayList;

public class ReverseAStringWordByWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
/*      2nd solution with string builder
		String name = "My Name is Suman";
		StringBuilder ans = new StringBuilder();
		int end = name.length();
		for(int i=name.length()-1;i>=0;i--) {
			if(name.charAt(i)==' ' || i==0) {
				if(i==0) {
					ans  = ans.append(name.substring(i, end));
				}
				else {
					ans = ans.append(name.substring(i+1, end)+" ");
				}
				end = i;
			}
		}

		System.out.print(ans);
*/
		
/*		1st solution
 * 		String name = "My Name is Suman";
		String b[] = name.split(" ");
		for(int i=b.length-1;i>=0;i--) {
			if(i==0) {
				System.out.print(b[i]);
			}else
			System.out.print(b[i]+" ");
		}
*/
	}

}
