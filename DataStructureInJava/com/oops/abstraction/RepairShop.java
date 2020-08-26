package com.oops.abstraction;

public class RepairShop {

	// Abstracttion - To reduce complexity // Showing only essential information
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WagonR wagonr = new WagonR();
		Audi audi = new Audi();
	//	Car car = new Car(); // Cannot be instantiated
		repaircar(wagonr);
		repaircar(audi);
		

	}
	public static void repaircar(WagonR car) {
		System.out.println("WagonR car repaired");
	}
	public static void repaircar(Audi car) {
		System.out.println("Audi car repaired");
	}

}
