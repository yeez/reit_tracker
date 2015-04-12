package com.reit;

import java.util.List;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.repeater.Item;
import org.apache.wicket.markup.repeater.RepeatingView;
import org.apache.wicket.markup.repeater.data.DataView;
import org.apache.wicket.markup.repeater.data.ListDataProvider;
import org.apache.wicket.request.mapper.parameter.PageParameters;

import com.reit.entities.Project;
import com.reit.service.ProjectService;

public class Home extends WebPage {

	private static final long serialVersionUID = 1L;

	ProjectService projectService;
	List<Project> projects1;

	public Home(final PageParameters parameters) {
		projectService = new ProjectService();
		
//		final ListView<Project> listView;
//        add(listView = new ListView<Project>("projects", new PropertyModel<List<Project>>(this,
//            "projects"))
//        {
//			private static final long serialVersionUID = 1L;
//
//			@Override
//            public void populateItem(final ListItem<Project> listItem)
//            {
//                final Project project= listItem.getModelObject();
//                
//                listItem.add(ProjectDetails.link("details", project ));
//        
//                listItem.add(new Label("test", new Model<Project>(project)));
//            }
//
//        });
   

		List<Project> projects = projectService.findAll();
		ListDataProvider<Project> listDataProvider = new ListDataProvider<Project>(projects);
		DataView<Project> dataView = new DataView<Project>("rows", listDataProvider) {

		  @Override
		  protected void populateItem(Item<Project> item) {
			  
			Project project = item.getModelObject();
		    RepeatingView repeatingView = new RepeatingView("dataRow");

		    repeatingView.add(new Label(repeatingView.newChildId(), project.getProjectName()));
		    repeatingView.add(new Label(repeatingView.newChildId(), project.getPersonResponsible().getName()));
		    repeatingView.add(new Label(repeatingView.newChildId(), project.getProperty().getPropertyOwner()));
		    repeatingView.add(new BookmarkablePageLink<ProjectDetails>(repeatingView.newChildId(),ProjectDetails.class));		    
		    item.add(repeatingView); 
//		    item.add(ProjectDetails.link("details", project));
		  }
		};
		add(dataView);
	}
    public List<Project> getProjects()
    {

        return this.projectService.findAll();
    }
}