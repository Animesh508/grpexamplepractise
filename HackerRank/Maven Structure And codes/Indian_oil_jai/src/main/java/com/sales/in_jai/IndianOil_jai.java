package com.sales.in_jai;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class IndianOil_jai {
	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(IndianOil_jai.class, args);
		
		Message_jai m = ctx.getBean(Message_jai.class);
		System.out.println(m.message());
		
		Student_jai s =ctx.getBean(Student_jai.class);
		System.out.println(s.getStudentinfo("Animesh"));
		
		DisplayMovieDetails_jai d = ctx.getBean(DisplayMovieDetails_jai.class);
		d.showDetails();
	}
	@Bean("con")
	public Connection getConnecton() throws Exception{
		return DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels","root","root");
	}
	
	

}
