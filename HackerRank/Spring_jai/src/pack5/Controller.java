package pack5;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class Controller {
	public static void main(String[] args) {
		Resource r = new ClassPathResource("pack5.xml");
		
		BeanFactory contex = new XmlBeanFactory(r);
		
		System.out.println("----------------------------");
		
		First f1 = (First)contex.getBean("first");
		Second s1= (Second)contex.getBean("second");
	}

}
