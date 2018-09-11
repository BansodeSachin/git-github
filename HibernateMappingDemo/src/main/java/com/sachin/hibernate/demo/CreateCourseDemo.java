package com.sachin.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sachin.hibernate.demo.entity.Course;
import com.sachin.hibernate.demo.entity.Instructor;
import com.sachin.hibernate.demo.entity.InstructorDetail;

public class CreateCourseDemo {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Instructor.class)
											.addAnnotatedClass(InstructorDetail.class)
											.addAnnotatedClass(Course.class)
											.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Course course1 = new Course("Spring");
			Course course2 = new Course("Hibernate");
			
			int theId=1;
			Instructor instructor = session.get(Instructor.class, theId);
			
			course1.setInstructor(instructor);
			course2.setInstructor(instructor);
			
			session.save(course1);
			session.save(course2);
			
			session.getTransaction().commit();
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
			sessionFactory.close();
		}
		
		

	}

}
