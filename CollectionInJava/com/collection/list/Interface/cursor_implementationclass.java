package com.collection.list.Interface;

import java.util.Enumeration;
import java.util.ListIterator;
import java.util.Vector;
import java.util.Iterator;
import java.util.*;

public class cursor_implementationclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vector v = new Vector<>();
		Enumeration e = v.elements();
		Iterator itr = v.iterator();
		ListIterator ltr = v.listIterator();
		System.out.println(e.getClass().getName());
		System.out.println(itr.getClass().getName());
		System.out.println(ltr.getClass().getName());
	}

}
