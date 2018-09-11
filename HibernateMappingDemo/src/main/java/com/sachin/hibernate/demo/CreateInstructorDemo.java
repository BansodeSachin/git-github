package com.sachin.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sachin.hibernate.demo.entity.Instructor;
import com.sachin.hibernate.demo.entity.InstructorDetail;

public class CreateInstructorDemo {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Instructor.class)
											.addAnnotatedClass(InstructorDetail.class)
											.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Instructor instructor = new Instructor("Sachin", "Bansode", "sachin@gmail.com");
			
			InstructorDetail detail = new InstructorDetail("youtube.com", "Dancing");
			
			instructor.setInstructorDetail(detail);
			
			session.save(instructor);
			
			session.getTransaction().commit();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
		
		

	}

}
