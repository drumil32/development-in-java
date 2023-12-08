package com.sadhulearning.springboot.learnjpaandhibernate.course.jdbc;

import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.sadhulearning.springboot.learnjpaandhibernate.course.Course;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

	private CourseJdbcRepository courseJdbcRepository;

	CourseJdbcCommandLineRunner(CourseJdbcRepository courseJdbcRepository) {
		this.courseJdbcRepository = courseJdbcRepository;
	}

	@Override
	public void run(String... args) throws Exception {
		this.courseJdbcRepository.insert();
		this.courseJdbcRepository.insert(new Course(2, "Learn GCP", "Drumil"));
//		this.courseJdbcRepository.delete(1);
		List<Course> courses = this.courseJdbcRepository.select();
		for (Course course : courses) {
		    System.out.println(course);
		}
		Course course = this.courseJdbcRepository.select(1);
		System.out.println(course);
	}

}
