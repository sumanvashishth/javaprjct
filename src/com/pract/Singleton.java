package com.pract;

public class Singleton {
	//private static Singleton singleton = new Singleton();
	private static Singleton instance = null;
	
	// Private constructor 
	private Singleton(){
		
	}
	public static Singleton getInstance(){
		if(instance == null){
			Singleton singleton = new Singleton();
			return instance;
		}
		else {
			return instance;
		}
		
	}
/*	//static instance method
	public static Singleton getInstance(){
		return singleton;	
	}*/
	
	/// Method to be called
	public static void demo(){
		
		System.out.println("Demo method for singleton changed");
	}

}
 
