package com.services.banking;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("NewFile.xml");
		Address adr = ctx.getBean(Address.class);
		adr.setAddressline1("shindola Mines");
		adr.setCity_name("Wani");
		System.out.println(adr);
		

	}

}
