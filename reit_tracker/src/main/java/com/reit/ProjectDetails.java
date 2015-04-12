package com.reit;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.model.Model;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.apache.wicket.util.string.StringValueConversionException;

import com.reit.entities.Project;
import com.reit.service.ProjectService;

public class ProjectDetails extends WebPage{
	
	public ProjectService projectService;
	public Project projectInHand;

	private static final long serialVersionUID = 1L;
	
	public ProjectDetails(final PageParameters parameters) throws StringValueConversionException
    {
		projectService = new ProjectService();
		projectInHand = projectService.findById(parameters.get("id").toString());
		
		setProjectInHand(projectInHand);
    }
	
	public ProjectDetails(final Project project){
		
	}
	
	public void setProjectInHand(final Project projectInHand){
		add(new Label("test", projectInHand.getId()));
        add(new Label("test2", projectInHand.getProjectName()));
        add(new Label("developer", projectInHand.getPersonResponsible().getName()));
        add(new Label("owner", projectInHand.getProperty().getPropertyOwner()));
	}
	
	public static BookmarkablePageLink<Void> link(final String name, final Project project)
	    {
	        final BookmarkablePageLink<Void> link = new BookmarkablePageLink<Void>(name,ProjectDetails.class);

	        link.add(new Label("test", new Model<Project>(project)));
	        
	        return link;
	    }
	

}
