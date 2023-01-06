package com.keserai.keseari2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;

import Profile_info.kJadhav;

@SpringBootApplication
@ComponentScan(basePackages = {"com.keserai.keseari2,profile_info"})
@PropertySource("classpath:application.properties")
public class Keseari2Application {

	public static void main(String[] args) {
		ApplicationContext ctx =SpringApplication.run(Keseari2Application.class, args);
		kJadhav kj = ctx.getBean(kJadhav.class);
		System.out.println(kj);
	}

}
