package com.reit.entities;

import java.util.HashMap;
import java.util.Map;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table (name = "project")
public class Project {

	private static long nextId = 0;

	private static final Map<Long, Project> idToProject = new HashMap<Long, Project>();

	@Id
	private long id;
	private String projectName;
	
	@OneToOne
	private PersonResponsible personResponsible;
	@OneToOne
	private Property property;

	public Project(String tempProjectName, PersonResponsible tempPersonResponsible, Property tempProperty)
	{
		id = nextId++;
		this.projectName = tempProjectName;
		this.personResponsible = tempPersonResponsible;
		this.property = tempProperty;

		add(this);
	}

	private void add(final Project project)
	{
		boolean hit = false;
		for (Project value : idToProject.values())
		{
			if (value.toString().equals(project.toString()))
			{
				project.id = value.id;
				hit = true;
				break;
			}
		}

		if (hit == false)
		{
			idToProject.put(project.id, project);
		}
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
