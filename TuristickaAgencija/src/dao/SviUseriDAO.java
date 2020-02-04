package dao;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SviUseriDAO {

	SessionFactory factory = new Configuration().configure().buildSessionFactory();
	
}
