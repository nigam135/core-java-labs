package com.deloitte.lab4.ex3;


import com.deloitte.lab4.ex3.Employee.*;

public interface EmployeeService {
	public Employee getEmpDetails();
	public String insuranceScheme(String designation,double Salary);
	public void EmpDetails(Employee emp);
}