package com.oops;

public class methods_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 155;
		int b = 66;
		System.out.println("Max of a & b is: "+ maxOfNum(a,b) +" Next: "+maxOfNum(00, 12 , 13) +" Next: "+maxOfNum(2.1f, 9.2f));
		
	}
	
	static int maxOfNum(int a, int b) {
		int max = a;
		if(a<b) {
			max = b;
		}
		return max;
	}
	static int maxOfNum(int a, int b , int c) {
		int max = a;
		int temp=b;
		if(b<c) {
			temp=c;
		}
		if(max<temp) {
		return temp;
		}else {
			return max;
		}
	}
	static float maxOfNum(float c, float d) {
		float max = c;
		if(c<d) {
			max = d;
		}
		return max;
	}
}
