package util.classes;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class controllerGetSessionFactory implements Cloneable {
	private static SessionFactory sessonFactory = null;
	
	private controllerGetSessionFactory() {}
	
	public static synchronized SessionFactory controllergetSessionFactoryInstance() {
		if(sessonFactory == null) {
			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");
			sessonFactory = configuration.buildSessionFactory();
			
			
		}
		
		return sessonFactory;
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		
		return new Exception();
	}
	
	

}
