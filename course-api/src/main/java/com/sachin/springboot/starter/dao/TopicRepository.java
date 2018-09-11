package com.sachin.springboot.starter.dao;

import org.springframework.data.repository.CrudRepository;

import com.sachin.springboot.starter.entity.Topic;

public interface TopicRepository extends CrudRepository<Topic, String> {

}
