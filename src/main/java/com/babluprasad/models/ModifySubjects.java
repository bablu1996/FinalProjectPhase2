package com.babluprasad.models;

public class ModifySubjects {
	
	private int id;
	private String name;
	
	public ModifySubjects(int id,String name) {
		super();
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name= name;
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

}
