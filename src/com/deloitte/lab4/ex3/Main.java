package com.deloitte.lab4.ex3;

import com.deloitte.lab4.ex3.Employee.*;

public class Main {
	public static void main(String[] args) {
		EmployeeServiceImpl emp = new EmployeeServiceImpl();
		Employee emp1 = emp.getEmpDetails();
		String scheme = emp.insuranceScheme(emp1.designation, emp1.salary);
		Employee person = new Employee(emp1.id,emp1.name,emp1.designation,scheme,emp1.salary);
		
		//System.out.println(emp1.name);
		//emp.insuranceScheme();
		emp.EmpDetails(person);
		

	}
}