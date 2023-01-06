package cityInfo_controller;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import cityInfo_jai.City_jai;
import session.factory.generater.Generate_session_factoryInstance;

public class citycontroller {
	public static void main(String[] args) {
		Session session = Generate_session_factoryInstance.getFactory().openSession();
		
		City_jai city = new City_jai(1, "Nagpur", "Maharashtra", 440001);
		Transaction tx = session.beginTransaction();
		Serializable id  = session.save(city);
		tx.commit();
		
		System.out.println(id);
		
		session.close();
		
		
	}

}
