package com.preethi.dependencyinjection;

public class Student {
	

	private String studentName;
	private int id;
	
	public Student( int id) {

		this.id =id;
	}
	
	public Student(String studentName, int id) {
		
		this.studentName = studentName;
		this.id =id;
	}
	
	public void displayStudentInfo() {
		System.out.println("student name is "+ studentName + " ID is " + id);
	}
	
	
//	public void setId(int id) {
//		this.id = id;
//	}
//	public void setStudentName(String studentName) {
//		this.studentName = studentName;
//	}
//
	

	
}
