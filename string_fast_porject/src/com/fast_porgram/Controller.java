package com.fast_porgram;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
	public static void main(String[] args) {
	ApplicationContext context = new ClassPathXmlApplicationContext("cofo.xml");
	Student student1 = (Student)context.getBean("student1");
	System.out.println(student1);
	}
}
