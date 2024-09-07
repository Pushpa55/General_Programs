package com.sritech.collections;

import java.util.Comparator;

public class AgeComparator implements Comparator<EmployeeC>{

	@Override
	public int compare(EmployeeC e1, EmployeeC e2) 
	{
		if(e1.getEmpAge()==e2.getEmpAge())
		{
			return 0;
		}
		else if(e1.getEmpAge() > e2.getEmpAge())
		{
			return 1;
		}
		else
		{
			return-1;
		}
	}

}
