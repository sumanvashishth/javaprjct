package com.collectionfwk.list;

public class GenericsPair<X, Y> {

	X x ;
	Y y;
	public GenericsPair(X x , Y y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
	public void getdescription() {
		System.out.println(x+" and "+y);
	}
}
