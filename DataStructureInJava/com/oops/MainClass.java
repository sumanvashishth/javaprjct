package com.oops;

public class MainClass {

	public static void main(String[] args) {
		Cat cat1 = new Cat();
		Dog dog1 = new Dog();
		cat1.walking();
		cat1.leg = 4;
		cat1.color = "white";
		dog1.walking();
		cat1.behaviour();
		}
	}
class Cat {
	String color , fur;
	int leg;
	public void walking() {
		System.out.println("cat is walking");
	}
	public void eating() {
		System.out.println("cat is eating");
	}
	public void behaviour() {
		System.out.println("My cat has "+leg+" legs and "+color+" color");
	}
}
class Dog{
	String breed , color;
	int leg;
	public void walking() {
		System.out.println("dog is walking");
	}
	

}
