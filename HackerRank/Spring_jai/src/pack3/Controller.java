package pack3;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Controller {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("pack3.xml");
		Student s= (Student)context.getBean("Student1");
		System.out.println(s);
	}

}
