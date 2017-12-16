package com.java.assignments.secondassignment;

public class EmployeeMain extends Employee{

	public static void main(String[] args) {
		
		EmployeeMain e = new EmployeeMain();
		e.setEmpName("Max");
		String ename = e.getEmpName();
		double amount = e.totalSalary(5000, 20, 5);
		System.out.println("The salary for the employee "+ ename +" is "+amount);

	}

}
