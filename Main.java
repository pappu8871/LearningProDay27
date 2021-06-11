package com.learning.inputoutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpPayrollService {
	private static List<EmpPayrollData>empPayrollList;

		public EmpPayrollService() {
	
		}

	public EmpPayrollService(ArrayList<EmpPayrollData>empPayrollList) {
		
	}

	public static void main(String[] args){
		ArrayList<EmpPayrollData>empPayrollList = new ArrayList<>();
		EmpPayrollService empPayrollService	= new EmpPayrollService(empPayrollList);
		Scanner scnInputReader = new Scanner(System.in);
		empPayrollService.readEmpPayrollData(scnInputReader);
		empPayrollService.writeEmpPayrollData();
	}

	private void readEmpPayrollData(Scanner scnInputReader) {
		System.out.println("Enter Emp ID:");
		int id = scnInputReader.nextInt();

		System.out.println("Enter Emp Name:");
		String name = scnInputReader.next();

		System.out.println("Enter Emp Salary:");
		double salary = scnInputReader.nextDouble();

		empPayrollList.add( new EmpPayrollData(id, name, salary));
	}
	private void writeEmpPayrollData() {

		//		System.out.println("Writing Emp payroll is"+ empPayrollList );
		System.out.println("Added:" + empPayrollList);

	}

}
