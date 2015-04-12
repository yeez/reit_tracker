package com.reit.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.apache.wicket.util.io.IClusterable;

@Entity
@Table (name = "project")
public class Project implements IClusterable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private long id;
	
	@Column(name = "project_name")
	private String projectName;
	
	@OneToOne(cascade = CascadeType.ALL)
	private PersonResponsible personResponsible;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Property property;
	
	public Project(){
		
	}

	public Project(String tempProjectName, PersonResponsible tempPersonResponsible, Property tempProperty)
	{
		this.projectName = tempProjectName;
		this.personResponsible = tempPersonResponsible;
		this.property = tempProperty;

	}

	
	@Override
    public final String toString()
    {
        return this.projectName + " (" + this.personResponsible.getName() + ")";
    }

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getProjectName() {
		return projectName;
	}

	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}

	public PersonResponsible getPersonResponsible() {
		return personResponsible;
	}

	public void setPersonResponsible(PersonResponsible personResponsible) {
		this.personResponsible = personResponsible;
	}

	public Property getProperty() {
		return property;
	}

	public void setProperty(Property property) {
		this.property = property;
	}

}
