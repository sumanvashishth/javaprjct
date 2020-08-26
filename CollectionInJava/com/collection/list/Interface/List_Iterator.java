package com.collection.list.Interface;

import java.util.LinkedList;
import java.util.ListIterator;

public class List_Iterator {
/*Bidirectional cursor
 * Addition of new object possible
 * Replace possible
 * Applicable only for list objects/classes
 * */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList<>();
		list.add("shiva");
		list.add("om");
		list.add("hari");
		list.add("shankar");
		System.out.println(list);
		ListIterator ltr = list.listIterator();
		while(ltr.hasNext()){
			String str = (String)ltr.next();
			if(str =="shiva"){
				System.out.println("next element: "+ltr.next() +"index: "+ltr.nextIndex());
			}
			if(str =="hari"){
				System.out.println("previous: "+ltr.previous()+"index: "+ltr.previousIndex());
			}
			if(str=="shankar"){
				ltr.remove();
			}
			if(str=="hari")
				ltr.set("shiv");
			if (str.equals("shiva"))
				ltr.add("gauri");		
		}
		System.out.println(list);
	}

}
