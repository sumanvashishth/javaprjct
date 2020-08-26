package com.collection.list.Interface;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.RandomAccess;

public class ArrayList_basicmethod {

	private static final String Serializable = null;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList al = new ArrayList();
		al.add(10);
		al.add("A");
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(10);
		al.add(null);
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2, "Hello");
		al.add("Summi");
		System.out.println(al);
		HashSet hs = new HashSet<>(al);
		System.out.println(hs);
		LinkedList ll = new LinkedList();
		System.out.println(al instanceof Serializable);
		System.out.println(ll instanceof Cloneable);
		System.out.println(al instanceof RandomAccess);
		System.out.println(ll instanceof RandomAccess);
	}

}
