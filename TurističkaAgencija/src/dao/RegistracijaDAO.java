package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import model.User;

public class RegistracijaDAO {

	public boolean upisiUseraUBazu(String userName, String password) {
		
		SessionFactory factory=new Configuration().configure().buildSessionFactory();

		User user= new User();
		
			user.setUserName(userName);
			user.setPassword(password);
			
			Session sesija = factory.openSession();
				sesija.beginTransaction();
				
			try {
				
				sesija.save(user);
				sesija.getTransaction().commit();
				return true;
				
			} catch (Exception e) {

				sesija.getTransaction().rollback();
				return false;
				
			} finally {
			
				sesija.close();
				
			}
			
		
	}
}
