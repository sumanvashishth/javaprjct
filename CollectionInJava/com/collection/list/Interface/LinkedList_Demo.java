package com.collection.list.Interface;

import java.util.LinkedList;

public class LinkedList_Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList ll = new LinkedList();
		ll.add(10);
		ll.add("Hello");
		System.out.println(ll);
		ll.add(1, "summi");
		System.out.println(ll);
		ll.set(2, 100);
		ll.add(2, null);
		ll.add("aaloo");
		System.out.println(ll);
		ll.remove(3);
		System.out.println(ll);
		ll.removeFirst();
		System.out.println(ll);
		ll.removeAll(ll);
		System.err.println(ll);
		
	}
}
