package com.preethi.dependencyinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Exam {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.setStudentName("preethi");
//		student.displayStudentInfo();
// 
		
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		
		Student p = context.getBean("pree", Student.class);
		p.displayStudentInfo();
		
		Student r = context.getBean("raj", Student.class);
		r
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		.displayStudentInfo();
		
//		Student ra = context.getBean("raj", Student.class);
//		ra.displayStudentInfo();
		
		
		  
	}

}
