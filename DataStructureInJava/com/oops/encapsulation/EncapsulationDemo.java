package com.oops.encapsulation;

public class EncapsulationDemo {

	EncapsulationDemo(){
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		stu.setName("Harry");
		stu.setAge(15);
		stu.setAge(10);
		System.out.println(stu.getAge()+" "+stu.getName());
	}

}
