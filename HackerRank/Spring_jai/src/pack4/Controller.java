package pack4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
	public static void main(String[] args) {
		ApplicationContext contex = new ClassPathXmlApplicationContext("pack4.xml");
		
		student s = (student)contex.getBean("stud1");
		
		System.out.println(s);
		
		
	}

}
