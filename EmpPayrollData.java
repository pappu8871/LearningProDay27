package com.learning.inputoutput;

public class EmpPayrollData {

	public int id;
	public String name;
	public double salary;

	public EmpPayrollData(Integer id, String name, Double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
		
	}

	@Override
	public String toString() {
		return "EmpPayrollData [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}

	

	

	
	
}
