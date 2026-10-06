package com.hibernate.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class App {
	public static void main(String[] args) {
// 	      1. Code for storing data in DB		
// 		  Object of student class
//        student s1=new student();
//        s1.setId(104);
//        s1.setName("Sakshi");
//        s1.setStudentClass("SDE");
//        
//        StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//        Metadata meta=new MetadataSources(ssr).getMetadataBuilder().build();
//        SessionFactory sf=meta.getSessionFactoryBuilder().build();
//        Session session=sf.openSession();
//        Transaction t=session.beginTransaction();
//
//        session.save(s1);
//        t.commit();
//        System.out.print("Successfully Updated");
//        session.clear();
//        session.close();
//        sf.close();

//		2. To retrieve data from DB 
//		student s1=new student();
//		 
//		StandardServiceRegistry ssr=new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sf = meta.getSessionFactoryBuilder().build();
//		Session session = sf.openSession();
//		Transaction t = session.beginTransaction();
//
//		s1=session.get(student.class, 104);
//		System.out.println(s1);
//		t.commit();
//		System.out.println("Successfully Updated");
//		session.clear(); 
//		session.close();
//		sf.close();

//	    3. Code for creating table and using marks class in student class. 	
//		student s1 = new student();
//		s1.setId(102);
//		s1.setName("Sakshi");
//		s1.setStudentClass("SDE");
//
//		marks m = new marks();
//		m.setEngMarks(12.2);
//		m.setCompMarks(15.5);
//		m.setMathMarks(16.8);
//
//		s1.setStudent_marks(m);
//		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sf = meta.getSessionFactoryBuilder().build();
//		Session session = sf.openSession();
//		Transaction t = session.beginTransaction();
//
//		session.save(s1);
//		t.commit();
//		System.out.print("Inserted Successfully");
//		session.clear();
//		session.close();
//		sf.close();
		
//		4. Using 2 level cache
//		student s1 = null;
//		
//		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfg.xml").build();
//		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
//		SessionFactory sf = meta.getSessionFactoryBuilder().build();
//		Session session = sf.openSession();
//		Transaction t = session.beginTransaction();
//		s1=session.get(student.class, 102);
//		System.out.println(s1);
//		t.commit();
//		
//		session.close();
//		Session session2 = sf.openSession();
//		Transaction t2 = session2.beginTransaction();
//		s1=session2.get(student.class, 102);
//		System.out.println(s1);
//		t2.commit();
//		sf.close();
		
//		5. HQL
		Employee employee1 = new Employee();

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		config.addAnnotatedClass(Employee.class);
		SessionFactory sf = config.buildSessionFactory();
		Session session = sf.openSession();
		
//		String query = "from Employee";
//		String query = "from Employee where name='Rk'";
//		String query = "from Employee where age>22";
		String query = "from Employee where name=:x"; 
		
		Query<Employee> q = session.createQuery(query, Employee.class);
		String userinput = "Sakshi";		
		q.setParameter("x", userinput);
		
		List<Employee> list = q.list();
		for (Employee emp : list) {
		    System.out.println(emp.getId() + " " + emp.getName() + " " + emp.getAge() + " " + emp.getCity());
		}
		
		session.close();
		sf.close();
	}
}
