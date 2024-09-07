package com.sritech.collections;

import java.util.ArrayList;
import java.util.Collections;

public class CEmployeeMain {
	
	public static void main(String[] args) {
		
		ArrayList<CEmployee> list=new ArrayList<CEmployee>();
		
		list.add(new CEmployee(1,"NAGA","MANAGER",500.00,"SALES","FEMALE",23) );
		list.add(new CEmployee(2,"PUSHPA","ANALYST",700.00,"FINANCE","FEMALE",23) );
		list.add(new CEmployee(3,"LATHA","CLEARK",900.00,"PURCHASE","FEMALE",26) );
		list.add(new CEmployee(4,"KOTCHERLA","DEVELOPER",1000.00,"IT","FEMALE",25) );
		
		Collections.sort(list);
		
		for(CEmployee emp : list)
		{
			System.out.println(emp);
		}
		
		
		
	}

}
