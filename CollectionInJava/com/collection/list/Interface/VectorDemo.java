package com.collection.list.Interface;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//First constructor
		Vector v = new Vector();
		for(int i=0;i<10;i++){
			v.addElement(i);
		}
		System.out.println(v.capacity());
		System.out.println(v);
		v.addElement("hey");
		System.out.println(v);
		System.out.println(v.capacity());
		
		//Second constructor
		Vector v1 = new Vector(15);
		for(int i=0;i<15;i++){
			v1.addElement(i);
		}
		System.out.println(v1.capacity());
		System.out.println(v);
		v1.addElement("hey");
		System.out.println(v1);
		System.out.println(v1.capacity());
		
		//Third constructor
		Vector v2 = new Vector(15 , 3);
		for(int i=0;i<15;i++){
			v2.addElement(i);
		}
		System.out.println(v2.capacity());
		System.out.println(v2);
		v2.addElement("hey");
		System.out.println(v2);
		System.out.println(v2.capacity());
		
	}

}
