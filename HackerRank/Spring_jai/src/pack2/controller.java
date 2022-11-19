package pack2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class controller {
	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("pack2.xml");
		Employee e = (Employee)contex.getBean("employee1");
		System.out.println(e);
	}

}
