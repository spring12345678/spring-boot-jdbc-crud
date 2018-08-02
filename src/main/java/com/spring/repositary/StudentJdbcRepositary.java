package com.spring.repositary;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.spring.java.Student;

@Repository
public class StudentJdbcRepositary {
	// inner class concept
	@Autowired
	JdbcTemplate jdbc;
	class StudentRowMapper implements RowMapper<Student>
	{

		@Override
		public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
			// TODO Auto-generated method stub
			Student student=new Student();
			student.setId(rs.getInt("id"));
			student.setName(rs.getString("name"));
			student.setMark(rs.getInt("mark"));
			return student;
		}
		
	}
	public List<Student> findAll()
	{
		return jdbc.query("select * from student",new StudentRowMapper());
	}
	
	public Student findbyId(int id)
	{
		return jdbc.queryForObject("select * from student where id=?", new Object[] {id},
		new BeanPropertyRowMapper<Student>(Student.class));
		
	}
	public int insert(Student student)
	{
		return jdbc.update("insert into student(id,name,mark)"+"values(?,?,?)",
				new Object[] {student.getId(),student.getName(),student.getMark()});
	}
	public int update(Student student)
	{
		return jdbc.update("update student "+"set name=?,mark=?"+"where id=?",
				new Object[] {student.getName(),student.getMark(),student.getId()});
	}

}
