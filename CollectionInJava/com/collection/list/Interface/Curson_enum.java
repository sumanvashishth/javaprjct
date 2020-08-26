package com.collection.list.Interface;

import java.util.Enumeration;
import java.util.Vector;

public class Curson_enum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v =  new Vector<>();
		for(int i=0;i<=10;i++){
			v.addElement(i);
		}
		System.out.println(v);
		Enumeration e = v.elements();
		System.out.println(e.getClass().getName());
		while(e.hasMoreElements()){
			Integer i = (Integer)e.nextElement();
			if(i%2==0){
			System.out.println(i);
			}
			
		}
		System.out.println(v);
	}

}
