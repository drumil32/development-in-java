package com.sadhulearning.springboot.learnjpaandhibernate.course.jdbc;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.sadhulearning.springboot.learnjpaandhibernate.course.Course;

public class CourseMapper implements RowMapper<Course> {

	@Override
	public Course mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Course course = new Course();

		course.setId(resultSet.getLong("id"));
		course.setName(resultSet.getString("name"));
		course.setAuthor(resultSet.getString("author"));

		return course;
	}

}
