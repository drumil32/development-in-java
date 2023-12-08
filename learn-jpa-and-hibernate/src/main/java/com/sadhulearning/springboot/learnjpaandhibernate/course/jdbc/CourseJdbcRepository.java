package com.sadhulearning.springboot.learnjpaandhibernate.course.jdbc;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.sadhulearning.springboot.learnjpaandhibernate.course.Course;

@Repository
public class CourseJdbcRepository {
	private JdbcTemplate springJdbcTemplate;

	public CourseJdbcRepository(JdbcTemplate springJdbcTemplate) {
		this.springJdbcTemplate = springJdbcTemplate;
	}

	private static String SELECT_QUERY = """
				select * from course
			""";

	private static String VARIABLE_SELECT_QUERY = """
				select * from course where id=?
			""";

	private static String INSERT_QUERY = """
				insert into course (id,name,author)
				values(1,'Learn AWS','Drumil')
			""";
	private static String VARIABLE_INSERT_QUERY = """
				insert into course (id,name,author)
				values(?,?,?)
			""";
	private static String VARIABLE_DELETE_QUERY = """
				delete from course where id=?
			""";

	public List<Course> select() {
//		return springJdbcTemplate.query(SELECT_QUERY, new CourseMapper());
		return springJdbcTemplate.query(SELECT_QUERY, new BeanPropertyRowMapper<>(Course.class));
	}

	public Course select(long id) {
		return springJdbcTemplate.queryForObject(VARIABLE_SELECT_QUERY, new CourseMapper(), id);
	}

	public void insert() {
		springJdbcTemplate.update(INSERT_QUERY);
	}

	public void insert(Course course) {
		springJdbcTemplate.update(VARIABLE_INSERT_QUERY, course.getId(), course.getName(), course.getAuthor());
	}

	public void delete(long id) {
		springJdbcTemplate.update(VARIABLE_DELETE_QUERY, id);
	}
}
