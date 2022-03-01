package com.babluprasad.models;

public class ModifyStudents {
	
	private int id;
	private String name;
	private int studentsclass;
	private int age;
	
	public ModifyStudents(int id,String name,int studentsclass,int age) {
		super();
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.studentsclass= studentsclass;
		this.age = age;
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

	public int getStudentsclass() {
		return studentsclass;
	}

	public void setStudentsclass(int studentsclass) {
		this.studentsclass = studentsclass;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	

}
