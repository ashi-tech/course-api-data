package com.ashi.tech.springbootstarter.courses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {
	
	@Autowired
	private CourseRepository courseRepository;

	/*private List<Topic> topics = new ArrayList<>(
			Arrays.asList(
					new Topic("maths", "Maths", "Maths topic"), 
					new Topic("physics", "Physics", "Physics topic"),
					new Topic("programming", "Programming", "Programming topic")));
    */
	public List<Course> getAllCourses(String topicId) {
		//return topics;
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(topicId)
		               .forEach(courses::add);
		return courses;
	}

	public Optional<Course> getCourse(String id) {
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return courseRepository.findById(id);
	}

	public void addCourse(Course course) {
		//topics.add(topic);
		courseRepository.save(course);
		
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(String id) {
		//topics.removeIf(t -> t.getId().equals(id));
		courseRepository.deleteById(id);
	}

}
