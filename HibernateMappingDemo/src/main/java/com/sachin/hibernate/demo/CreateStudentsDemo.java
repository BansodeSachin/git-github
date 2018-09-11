package com.sachin.hibernate.demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.sachin.hibernate.demo.entity.Course;
import com.sachin.hibernate.demo.entity.Instructor;
import com.sachin.hibernate.demo.entity.InstructorDetail;
import com.sachin.hibernate.demo.entity.Student;

public class CreateStudentsDemo {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration()
											.configure("hibernate.cfg.xml")
											.addAnnotatedClass(Instructor.class)
											.addAnnotatedClass(InstructorDetail.class)
											.addAnnotatedClass(Course.class)
											.addAnnotatedClass(Student.class)
											.buildSessionFactory();
		
		Session session = sessionFactory.getCurrentSession();
		
		try {
			
			session.beginTransaction();
			
			Student student = new Student(103, "Sachin3", "Bansode3", "sachin@gmail.com");
			
			Course course1 = new Course("MySQL");
			Course course2 = new Course("Oracle");
			
			student.addStudent(course1);
			student.addStudent(course2);
			
			session.save(student);
			
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
