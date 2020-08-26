package com.oops;

public class PassByValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c = 12;
		int d = 34;
		swap(c,d);
		System.out.println(c+" "+d);	
		dog a = new dog();
		a.legs = 4;
		dog b = new dog();
		b.legs = 5;
		swap(a,b);
		System.out.println(a.legs+" "+b.legs);
		changedog(a);
		System.out.println(a.legs+" "+b.legs);
		
	}

	static void swap(int a , int b) {
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a+":"+b);
	}
	static void swap(dog a , dog b) {
		dog temp = a;
		a.legs = b.legs;
		b.legs = temp.legs;
	}
	static void changedog(dog dog) {
		dog.legs = 6;
	}
}
class dog {
	int legs;
	
	
}
