package com.ashi.tech.springbootstarter.courses;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course,String> {

	
	//custom find method
	//public List<Course> findbyName(String name);
	public List<Course> findByTopicId(String topicId);
	
}
