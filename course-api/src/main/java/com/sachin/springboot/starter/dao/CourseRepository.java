package com.sachin.springboot.starter.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.sachin.springboot.starter.entity.Course;
import com.sachin.springboot.starter.entity.Topic;

public interface CourseRepository extends CrudRepository<Course, String> {

	public List<Course> findByTopicId(String topicId);
}
