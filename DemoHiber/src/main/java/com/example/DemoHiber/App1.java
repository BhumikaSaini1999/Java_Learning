//package com.example.DemoHiber;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.hibernate.Session;
//import org.hibernate.SessionFactory;
//import org.hibernate.Transaction;
//import org.hibernate.cfg.Configuration;
//
////OneToMany Relationship Example
//public class App1 {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		Laptop laptop1 = new Laptop();
//		laptop1.setLid(101);
//		laptop1.setLname("HP");
//		
//		Laptop laptop2 = new Laptop();
//		laptop2.setLid(102);
//		laptop2.setLname("Lenovo");
//		
//		Student s1 = new Student();
//		s1.setRollNo(1);
//		s1.setName("Neeraj Saini");
//		s1.setMarks(200);
//		s1.getLaptops().add(laptop1);
//		s1.getLaptops().add(laptop2);
//		
//
//		Student s2 = new Student();
//		s2.setRollNo(2);
//		s2.setName("Bhumika Saini");
//		s2.setMarks(600);
//		s2.getLaptops().add(laptop1);
//		s2.getLaptops().add(laptop2);
//		
//		//many-to-many relationship
////		laptop1.getStudents().add(s1);
////		laptop1.getStudents().add(s2);
////		laptop2.getStudents().add(s1);
////		laptop2.getStudents().add(s2);
//
//		
//		Configuration con = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//		SessionFactory sf = con.buildSessionFactory();
//		Session session = sf.openSession();
//		Transaction tx = session.beginTransaction();
//		
//		session.save(laptop1);
//		session.save(laptop2);
//		session.save(s1);
//		session.save(s2);
//		tx.commit();
//		session.close();
//	}
//
//}
