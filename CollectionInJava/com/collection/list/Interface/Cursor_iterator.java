package com.collection.list.Interface;

import java.util.ArrayList;
import java.util.Iterator;
/*Limitations of Iterator : always moves in fwd direction "Single direction cursor" , 
 * Replace not possible
 * Addition of new element not possible.*/
public class Cursor_iterator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList al = new ArrayList<>();
		for(int i = 0;i<10;i++){
			al.add(i);
		}
		System.out.println(al);
		Iterator itr = al.iterator();
		while(itr.hasNext()){
			Integer a = (Integer)itr.next();
			if(a%2==0)
			System.out.println(a);
			else
				itr.remove();
		}
		System.out.println(al);
	}

}
