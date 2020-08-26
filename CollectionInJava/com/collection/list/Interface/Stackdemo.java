package com.collection.list.Interface;

import java.util.Stack;

public class Stackdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s = new Stack();
		s.push("A");
		s.push("B");
		s.push("C");
		s.push("D");
		System.out.println(s);
		s.pop();
		System.out.println(s);
		s.push("F");
		System.out.println(s.peek());
		System.out.println(s.search("Z"));
		System.out.println(s.search("A"));
		System.out.println(s.empty());
		
	}

}
