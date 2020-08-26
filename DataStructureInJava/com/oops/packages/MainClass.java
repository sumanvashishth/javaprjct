package com.oops.packages;

import com.oops.packages.models.Student;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu = new Student();
		System.out.println(stu.age);
		/* name is Private ... So cannot be accessed
		 * stu.name = "Ram"; System.out.println(stu.name);
		 */
		/* getPassword is private method .. cant be accessed
		 * System.out.println(stu.getpassword()); */
	}

}
