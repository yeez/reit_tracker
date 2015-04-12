package com.reit;

import java.util.List;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import com.reit.entities.PersonResponsible;
import com.reit.entities.Project;
import com.reit.entities.Property;
import com.reit.entities.Property.PropertyType;
import com.reit.service.ProjectService;


public final class ReitTrackerApplication extends WebApplication {

	ProjectService projectService;
	List<Project> projects;
	
	public ReitTrackerApplication()
	{
//		PersonResponsible personResponsible = new PersonResponsible ("Yasser Rep");
//		Property property = new Property(PropertyType.APPARTMENT, 1009, "Yasser");
//		Project project = new Project("test", personResponsible, property );
//		
//		project.setPersonResponsible(personResponsible);
//		project.setProperty(property);
//		
//		projectService = new ProjectService();
//		projectService.persist(project);
//		
//		projects = projectService.findAll();
//		System.out.println("test");
	}
	@Override
	public Class<? extends Page> getHomePage()
	{
		return Home.class;
	}

	@Override
	protected void init()
	{
		super.init();
	}
}