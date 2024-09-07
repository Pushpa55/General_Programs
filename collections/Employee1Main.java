package com.sritech.collections;

import java.util.ArrayList;
import java.util.Iterator;

public class Employee1Main {
	public static void main(String[] args) {
		
		String [] records={"1001,ajay,manager,account,45000,male,38",
				          "1002,aiswrya,clerk,admin,25000,female,30",
			              "1003,varun,manager,sales,50000,male,35",
		                  "1004,amit,manager,account,47000,male,40",
			              "1005,kareena,executive,sales,15000,female,24",
			              "1006,deepak,clerk,admin,23000,male,30",
		                  "1007,sunil,accountant,sales,13000,male,29",
		                  "1008,satvik,director,purchase,80000,male,45" };
		
		ArrayList<Employee1> list=new ArrayList<Employee1>();
		
		for(String record :records)
		{
			String [] fields =record.split(",");
		
			Employee1 employee1=new Employee1();
			
			employee1.setEmpNum(Integer.parseInt(fields[0]));
			employee1.setEmpName(fields[1]);
			employee1.setEmpJob(fields[2]);
			employee1.setEmpDeptName(fields[3]);
			employee1.setEmpSalary(Double.parseDouble(fields[4]));
			employee1.setEmpGender(fields[5]);
			employee1.setEmpAge(Integer.parseInt(fields[6]));
			
			list.add(employee1);
			
		}
		System.out.println("Employee records loaded into array list");
		System.out.println("No.of elements array list :"+list.size());
		
		Iterator<Employee1>iterator=list.iterator();
		
		while(iterator.hasNext())
		{
			Employee1 emp=iterator.next();
			
			int empNum = emp.getEmpNum();
			String empName = emp.getEmpName();
			String empJob = emp.getEmpJob();
			String empDeptName = emp.getEmpDeptName();
			String empGender = emp.getEmpGender();
			int empAge = emp.getEmpAge();
			
			System.out.println(empNum+"\t"+empName+"\t"+empJob+"\t"+empDeptName+"\t"+empGender+"\t"+empAge);
			
			
			
		}
		
 
	}

}
