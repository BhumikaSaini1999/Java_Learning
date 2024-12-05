//package com.example.DemoHiber;
//
//import org.hibernate.SessionFactory;
//import org.hibernate.cfg.Configuration;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.Transaction;
//import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
//import org.hibernate.service.Service;
//import org.hibernate.service.ServiceRegistry;
//
////@SpringBootApplication
//public class DemoHiberApplication2 {
//
//	//Case1
//	public static void main(String[] args) {
//		//SpringApplication.run(DemoHiberApplication.class, args);
//		
//		//1) Making Entry into Database
//		Alien telusko = new Alien();
//		telusko.setAid(102);
//		telusko.setAname("Neeru");
//		telusko.setAcolour("Blue");
//		
////		
////		Laptop lap1 = new Laptop();
////		lap1.setLid(1);
////		lap1.setLname("HP");
////		lap1.setAlien(telusko);
////		telusko.getLaptos().add(lap1);
////				
////		Laptop lap2 = new Laptop();
////		lap2.setLid(2);
////		lap2.setLname("Mac");
////		lap2.setAlien(telusko);
////		telusko.getLaptos().add(lap2);
//		
//		Configuration con = new Configuration().configure().
//				addAnnotatedClass(Alien.class).addAnnotatedClass(Laptop.class);
//		
//		SessionFactory sf = con.buildSessionFactory();
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		
//		Laptop l1 = session.get(Laptop.class, 1);
//		telusko.getLaptos().add(l1);
//		l1.setAlien(telusko);
//		session.save(l1);
//		session.save(telusko);
//
////		session.save(telusko);
////		session.save(lap1);
////		session.save(lap2);
//		
//		//2) Retrieve Entry from Database
//	    //Alien telusko = session.get(Alien.class, 101);
//	    //System.out.println("Entry=>"+telusko);
//	    
////	    List<Laptop> laptops = telusko.getLaptos();
////	    for(Laptop l : laptops) {
////		    System.out.println(l);
////	    }
//	    
//		tx.commit();
//		session.close();
//	}
//}
//
//
