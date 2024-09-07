package com.sritech.collections;

public class CEmployee implements Comparable<CEmployee> {

	private Integer empNum;
	private String empName;
	private String empJob;
	private Double empSalary;
	private String empDeptName;
	private String empGender;
	private Integer empAge;
	
	public CEmployee(Integer empNum,String empName,String empJob,Double empSalary,String empDeptName,String empGender,Integer empAge)
	{
		this.empNum=empNum;
		this.empName=empName;
		this.empJob=empJob;
		this.empSalary=empSalary;
		this.empDeptName=empDeptName;
		this.empGender=empGender;
		this.empAge=empAge;
		
	}

	public Integer getEmpNum() {
		return empNum;
	}

	public void setEmpNum(Integer empNum) {
		this.empNum = empNum;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpJob() {
		return empJob;
	}

	public void setEmpJob(String empJob) {
		this.empJob = empJob;
	}

	public Double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(Double empSalary) {
		this.empSalary = empSalary;
	}

	public String getEmpDeptName() {
		return empDeptName;
	}

	public void setEmpDeptName(String empDeptName) {
		this.empDeptName = empDeptName;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	public Integer getEmpAge() {
		return empAge;
	}

	public void setEmpAge(Integer empAge) {
		this.empAge = empAge;
	}

	@Override
	public String toString() {
		return empNum + "," + empName + "," + empJob + ","+ empSalary + "," + empDeptName + "," + empGender + "," + empAge ;
	}


	@Override
	public int compareTo(CEmployee emp) {

		if( empAge == emp.empAge )
		{				
			return 0;
		}
		else if ( empAge < emp.empAge )
		{
			return 1;
		}
		else
		{
			return -1;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
