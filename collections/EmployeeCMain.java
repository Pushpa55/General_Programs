package com.sritech.collections;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeCMain {
	
public static void main(String[] args) {
		
		ArrayList<EmployeeC> list=new ArrayList<EmployeeC>();
		
		list.add(new EmployeeC(1,"NAGA","MANAGER",500.00,"SALES","FEMALE",23) );
		list.add(new EmployeeC(2,"PUSHPA","ANALYST",700.00,"FINANCE","FEMALE",24) );
		list.add(new EmployeeC(3,"LATHA","CLEARK",900.00,"PURCHASE","FEMALE",26) );
		list.add(new EmployeeC(4,"KOTCHERLA","DEVELOPER",1000.00,"IT","FEMALE",25) );
		
		
		System.out.println("Comparing based on salary");
		
		Collections.sort(list, new SalaryComparator());
		
		for(EmployeeC emp  : list )
		{
			System.out.println(emp);
		}
		
		System.out.println("Comparing based on age");
		
		Collections.sort(list,new AgeComparator());
		
		for(EmployeeC emp : list)
		{
			System.out.println(emp);
		}

		

    }
}
