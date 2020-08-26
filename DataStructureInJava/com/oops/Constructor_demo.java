package com.oops;

public class Constructor_demo {
	Constructor_demo (){
		System.out.println("object is now created");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Constructor_demo cd = new Constructor_demo();
		Vehicles car1 = new Vehicles();
		Vehicles car = new Vehicles(4);
		Vehicles scooty = new Vehicles(2);
		Vehicles rickshaw = new Vehicles(3, "Yellow");
		System.out.println(car1.wheels);
		System.out.println(car.wheels+" wheels and " + car.headlights +" headlights");
		System.out.println(scooty.wheels+" wheels and " + scooty.headlights +" headlights");
		System.out.println(rickshaw.wheels+" wheels and " + rickshaw.color+" Color "+rickshaw.headlights +" headlights");
	}
}
/* Constructor - when we know value of states e.g. no. of wheels, before hand, we can initialize them in constructor. 
 * Default constructor - No arguments
 */
class Vehicles{
	int wheels;
	int headlights;
	String color;
	//Default constructor
	  Vehicles(){ 
		 //wheels = 4;  // Constructor
		  }
	 
	//Parameterized constructor
	Vehicles(int wheels){
		this.wheels = wheels;
		headlights= 2;
	}
	//Parameterized constructor with diff parameters
	Vehicles(int wheels , String color){
		this.wheels = wheels;
		this.color = color;
		headlights = 2;
	}
}
