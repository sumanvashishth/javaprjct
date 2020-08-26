package com.pract;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String S1 = sc.next();
		String S2 = sc.next();
		System.out.println(anagram(S1, S2));
	}

	private static boolean anagram(String s1, String s2) {
		// TODO Auto-generated method stub
		int noofchars = 256;
		int count1[]=new int[noofchars];
		int count2[]=new int[noofchars];
		char S1[] = s1.toCharArray();
		char S2[] = s2.toCharArray();
		if(s1.length() != s2.length())
			return false;

		for(int i = 0;i<s1.length();i++){
			System.out.println(S1[i]+" "+S2[i]);
			count1[S1[i]]++; 
            count2[S2[i]]++; 
		}
        for (int i = 0; i < noofchars; i++) 
            if (count1[i] != count2[i]) 
                return false; 
			
		return true;
		}
	
	}
	
