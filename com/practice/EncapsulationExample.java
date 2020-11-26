package com.practice;

public class EncapsulationExample {
	public static void main(String... args) {
	
		EmployeeCount ob = new EmployeeCount ();
		ob.setEmployee(200);
		System.out.println("No. of employee : " + (int)ob.getEmployee());
	}

}
