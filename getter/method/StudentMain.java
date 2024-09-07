package com.sritech.getter.method;

public class StudentMain{
	public static void main(String[] args) {
		StudentTest studentTest =new StudentTest();
		studentTest.setStudentRollNo(33);
		studentTest.setStudentName("Pushpa");
		studentTest.setStudentCourse("M.sc");
		studentTest.setStudentClg("Acharya Nagarjuna University");
		studentTest.setStudentFee(10000.00);
		studentTest.setStudentID(1234);
		studentTest.setStudentGender("FEMALE");
		
		int studentRollNo=studentTest.getStudentRollNo();
		String studentName=studentTest.getstudentName();
		String studentCourse=studentTest.getstudentCourse();
		String studentClg=studentTest.getstudentClg();
		double studentFee=studentTest.getStudentFee();
		int studentID=studentTest.getStudentID();
		String studentGender=studentTest.getStudentGender();	
		
		System.out.println(studentRollNo+"\t"+studentName+"\t"+studentCourse+"\t"+studentClg+"\t"+studentFee+"\t"+studentID+"\t"+studentGender);
		
	}

}
