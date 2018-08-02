package com.spring.java;

public class Student {
	int id;

	String name;

	int mark;

	public Student(int i, String string, int j) {
		// TODO Auto-generated constructor stub
		this.id = i;
		this.name = string;
		this.mark = j;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMark() {
		return mark;
	}

	public void setMark(int mark) {
		this.mark = mark;
	}

}
