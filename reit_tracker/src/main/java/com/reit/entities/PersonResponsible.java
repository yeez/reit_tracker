package com.reit.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "person_responsible")
public class PersonResponsible {
	
	@Id
	private long id;
	
	@Column(name = "name")
	private String name;
	
	public PersonResponsible (long id, String tempName){
		this.id = id;
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
