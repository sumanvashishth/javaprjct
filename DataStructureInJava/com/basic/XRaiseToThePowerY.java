package com.basic;

import java.util.Scanner;

public class XRaiseToThePowerY {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int count = 0;
		int res = 1;
		//For Loop
		for(int i=0;i<y;i++) {
			res = res *x;
		}
		System.out.println(res);
		
		/* While Loop
		 * while(count<y) { res = res*x; count++; } System.out.println(res);
		 */
	}

}
