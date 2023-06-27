package com.Hibernate.connection;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

public class HibernateConfigure {
	public static SessionFactory getconnection() {
		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		return sf;
		
	}

}
