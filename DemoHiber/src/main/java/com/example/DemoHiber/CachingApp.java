package com.example.DemoHiber;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

public class CachingApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
		ServiceRegistry reg = new ServiceRegistryBuilder().applySettings(con.getProperties()).buildServiceRegistry();
		SessionFactory sf = con.buildSessionFactory(reg);
		
		//Scenario1: Ist level cache will be used in this case=>query will fire one time
//		Session s = sf.openSession();
//		s.beginTransaction();
//		Alien a = s.get(Alien.class, 101);
//		System.out.println(a);
//		
//		Alien b = s.get(Alien.class, 101);
//		System.out.println(b);
		
		//Scenario2: Ist level cache with different session=>query will fire two times
		Session s1 = sf.openSession();
		s1.beginTransaction();
		
		//Hibernate Caching Level 2 with Query
		Query q1 = s1.createQuery("from Alien where aid=101");//2nd case with query (Caching Level 2)
		q1.setCacheable(true);
		Alien a = (Alien) q1.uniqueResult();
		
		//Alien a = (Alien) s1.get(Alien.class, 101); //ist case with classes and objects
		System.out.println(a);
		s1.getTransaction().commit();
		s1.close();
		
		Session s2 = sf.openSession();
		s2.beginTransaction();
		
		//Hibernate Caching Level 2 with Query
		Query q2 = s2.createQuery("from Alien where aid=101");
		q2.setCacheable(true);
		Alien b = (Alien) q2.uniqueResult();
		
		//Alien b = (Alien) s2.get(Alien.class, 101); //ist case with classes and objects (Caching Level 2)
		System.out.println(b);
		s2.getTransaction().commit();
		s2.close();
		
		
		
	}

}
