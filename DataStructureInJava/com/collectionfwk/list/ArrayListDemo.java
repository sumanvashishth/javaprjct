package com.collectionfwk.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Use of generics
		List <Integer> Lst = new ArrayList<>();
		
		ArrayList<Integer> AL = new ArrayList<Integer>();
		AL.add(10);
		AL.add(5);
		AL.add(8);
		AL.add(7);
		AL.add(2);
	//  AL.add("Hello");   // Not allowed
		System.out.println(AL);
		AL.remove(3);
		System.out.println(AL);
		
		// Without generics
		ArrayList arraylist = new ArrayList<>();
		arraylist.add(10);
		arraylist.add("Summi");
		arraylist.add("12");
		arraylist.add(45);
		System.out.println(arraylist);
		arraylist.remove(3);
		System.out.println(arraylist);
		arraylist.addAll(AL);
		System.out.println(arraylist);
		
		// Use of generics class
		GenericsPair<String, Integer> gp = new GenericsPair("Summi", 30);
		GenericsPair<Boolean, String> p = new GenericsPair(true, "Aaloo");
		gp.getdescription();
		p.getdescription();
		
	}
	/* add - for adding
	 * set - for replacing elements
	 * clear - remove all elements
	 * removeall - remove a list or multiple elements
	 * contains - find elements
	 * size -
	 * getindex - 
	 * isempty - 
	 * to.array - converts object array to another array
	 */

}
