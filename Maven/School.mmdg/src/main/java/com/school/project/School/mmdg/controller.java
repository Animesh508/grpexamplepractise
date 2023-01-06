package com.school.project.School.mmdg;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class controller {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
		
		Student s = ctx.getBean(Student.class);
		
		
		System.out.println(s.msg());
	}
	
	

}
