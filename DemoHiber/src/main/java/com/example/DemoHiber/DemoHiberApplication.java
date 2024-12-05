//package com.example.DemoHiber;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.service.Service;
//import org.hibernate.service.ServiceRegistry;
//
////@SpringBootApplication
//public class DemoHiberApplication {
//
//	//Case1
//	public static void main(String[] args) {
//		//SpringApplication.run(DemoHiberApplication.class, args);
//		
//		//1) Making Entry into Database
//		Alien telusko = new Alien();
//		telusko.setAid(102);
//		telusko.setAname("Bhumi");
//		telusko.setAcolour("Pink");
//		
//		Address address = new Address();
//		address.setCity("Gurgaon");
//		address.setState("Haryana");
//		address.setCountry("India");
//		telusko.setAddress(address);
//		
//		Configuration con = new Configuration().configure().addAnnotatedClass(Alien.class);
//		
//		//we can use below 2 lines also
//		//ServiceRegistry reg = new StandardServiceRegistryBuilder().applySettings(con.getProperties()).build();
//		//SessionFactory sf = con.buildSessionFactory(reg);
//		
//		SessionFactory sf = con.buildSessionFactory();
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		session.save(telusko);
//		
//		
//		//2) Retrieve Entry from Database
//	    //Alien telusko2 = session.get(Alien.class, 101);
//	    //System.out.println("Entry=>"+telusko2);
//	    
//		tx.commit();
//		session.close();
//	}
//}
//
//
