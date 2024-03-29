package com.sachin.springboot.starter.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sachin.springboot.starter.dao.CourseRepository;
import com.sachin.springboot.starter.dao.TopicRepository;
import com.sachin.springboot.starter.entity.Course;
import com.sachin.springboot.starter.entity.Topic;


@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	/*private List<Topic> topics = new ArrayList<>(Arrays.asList(
			new Topic("Spring","Spring Framework", "Spring Framework Description"),
			new Topic("Java","Core Java", "Core Java Description"),
			new Topic("JavaScript","JavaScript", "JavaScript Description")
			));*/
	
	public List<Course> getAllCourses(String topicId) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findOne(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		courseRepository.delete(id);
	}
}
