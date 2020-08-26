package com.oops.polymorphism;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Pet p = d;
		Animal a =  p;
		d.walk();
		p.walk();  // Runtime Plymorphism or Overriding or Dynamic binding or late binding
		Pet pet = new Pet();
		pet.walk(); 
		System.out.println(d.name);
		System.out.println(p.name); // Variables can't be overridden
		// a.walk();  compile time checking
		String s = "Hello , Greetings ";
		greetings();
		greetings(s);
		
		
	}
	// Compile Time polymorphism or Static binding or Early binding or Overloading
	public static void greetings() {
		System.out.println("Greetings");
	}
	public static void greetings(String s) {
		System.out.println(s);
	}

}
