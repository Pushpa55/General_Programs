package com.sritech.getter.method;

public class EmployeeMain {
	public static void main(String[] args) {
		EmployeeTest employeeTest=new EmployeeTest();
		employeeTest.setEmpNum(33);
		employeeTest.setEmpName("Pushpa");
		employeeTest.setEmpJob("Manager");
		employeeTest.setEmpSalary(50000.00);
		employeeTest.setEmpDeptName("TESTING");
		employeeTest.setEmpGender("Female");
		employeeTest.setEmpAge(23);
		int empNum=employeeTest.getEmpNum();
		String empName=employeeTest.getEmpName();
		String empJob=employeeTest.getEmpJob();
		double empSalary=employeeTest.getEmpSalary();
		String empDeptName=employeeTest.getEmpDeptName();
		String empGender=employeeTest.getEmpGender();
		int empAge=employeeTest.getEmpAge();
		System.out.println(empNum+"\t"+empName+"\t"+empJob+"\t"+empSalary+"\t"+empDeptName+"\t"+empGender+"\t"+empAge );
	}

}
