package com.recursion;

import java.util.Scanner;

public class FindPathInAGrid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int R = sc.nextInt();
		int C = sc.nextInt();
		System.out.println("Path is: "+findpath(R,C));
	}

	private static int findpath(int r, int c) {
		// TODO Auto-generated method stub
		if (r==1 || c == 1) return 1; 
		
		return findpath(r, c-1)+findpath(c, r-1);
	}
}
