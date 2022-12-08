package com.services_NIKE;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
	public static void main(String[] args) {
		ApplicationContext ab = new ClassPathXmlApplicationContext("NIKE.xml");
		Address adr = ab.getBean(Address.class);
		adr.setPinCode(440006);
		adr.setAddressLine1("near durga mata mandir");
		adr.setCityName("Nagpur");

		System.out.println(adr);
	}

}
