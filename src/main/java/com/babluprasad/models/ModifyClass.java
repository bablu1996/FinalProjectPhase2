package com.babluprasad.models;

public class ModifyClass {
	private int id;
	private String teacher;
	private String subject;
	
	public ModifyClass(int id,String teacher,String subject) {
		super();
		// TODO Auto-generated constructor stub
		this.id = id;
		this.teacher= teacher;
		this.subject = subject;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	public String getTeacher() {
		return teacher;
	}

	public void setTeacher(String teacher) {
		this.teacher = teacher;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	
	

}
