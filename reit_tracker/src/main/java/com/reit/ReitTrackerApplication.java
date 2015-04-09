package com.reit;

import java.util.List;

import org.apache.wicket.Page;
import org.apache.wicket.protocol.http.WebApplication;

import com.reit.entities.Project;
import com.reit.service.ProjectService;


public final class ReitTrackerApplication extends WebApplication {

	ProjectService projectService;
	List<Project> projects;
	
	public ReitTrackerApplication()
	{
		projectService = new ProjectService();
		projects = projectService.findAll();
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