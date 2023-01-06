package session.factory.generater;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Generate_session_factoryInstance {
	public static SessionFactory sf = null;
	
	static {
		Configuration cgf = new Configuration();
		cgf.configure("config.cfg.xml");
		sf = cgf.buildSessionFactory();
	}
	public static SessionFactory getFactory() {
		return sf;
	}

}