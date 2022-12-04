package online_banking.com.services;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Controller{
	
	public static void main(String[] args) {
	
		ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
		
		Address adtr = ctx.getBean(Address.class);
		
		adtr.setCityName("Pune");
		
		System.out.println(adtr);
	}
}