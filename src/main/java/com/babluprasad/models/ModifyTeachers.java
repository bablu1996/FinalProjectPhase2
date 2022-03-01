package com.babluprasad.models;

public class ModifyTeachers {
	
	private int id;
	private String name;
	private int age;
	private String subject;
	private int aclass;
	
	public ModifyTeachers(int id,String name,int age,String subject,int aclass) {
		super();
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name= name;
		this.age= age;
		this.subject = subject;
		this.aclass= aclass;
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
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public int getAclass() {
		return aclass;
	}
	public void setAclass(int aclass) {
		this.aclass = aclass;
	}
	
}
