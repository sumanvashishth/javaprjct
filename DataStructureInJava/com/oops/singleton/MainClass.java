package com.oops.singleton;

public class MainClass {

	public void main (String args[]) {
		
		AppConfig obj = AppConfig.getInstance();
		AppConfig obj2 = AppConfig.getInstance(); // Same object is called again and again
		AppConfig obj3 = AppConfig.getInstance(); // Same object
	}
	
}
