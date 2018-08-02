package com.spring;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/*import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication*/

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.spring.java.Student;
import com.spring.repositary.StudentJdbcRepositary;

@SpringBootApplication
public class StudentApp implements CommandLineRunner {
	private Logger logger =LoggerFactory.getLogger(this.getClass());
	@Autowired
	StudentJdbcRepositary repositary;
	public static void main(String[] args) {
		
	
		SpringApplication.run(StudentApp.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		logger.info("Student id 10001 -> {}", repositary.findbyId(1));

		logger.info("Inserting -> {}", repositary.insert(new Student(6,"abc",3)));

		logger.info("Update 10003 -> {}", repositary.update(new Student(6,"def",78)));

		

		logger.info("All users -> {}", repositary.findAll());
		
		
	}
}


	