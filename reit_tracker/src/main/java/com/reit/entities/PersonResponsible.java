package com.reit.entities;

public class PersonResponsible {
	
	private static long nextId = 0;
	
	private long id;
	private String name;
	
	public PersonResponsible (String tempName){
		this.name = tempName;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
