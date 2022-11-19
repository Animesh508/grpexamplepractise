package pack1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class controller {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("application_java.xml");
		Student s =(Student)context.getBean("Student1");
		s.showdata();
	}

}
