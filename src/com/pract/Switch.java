package com.pract;

public class Switch {
public static void main(String argv[]){

	int i=9; 
	switch (i) 
	{ 
	default :
		System.out.println("default"); 
		break;
	case 0: 
		System.out.println("zero"); 
		break; 
	case 1: 
		System.out.println("one"); 
		case 2: System.out.println("two"); 
	}
}
}
