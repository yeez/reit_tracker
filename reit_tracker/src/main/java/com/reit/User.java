package com.reit;

import java.util.ArrayList;
import java.util.List;

import org.apache.wicket.util.io.IClusterable;

import com.reit.entities.Project;

public final class User implements IClusterable
{


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	// The user's personal projects list
    private List<Project> projects = new ArrayList<Project>();

    /**
     * @return User's project list
     */
    public final List<Project> getProjects()
    {
        return projects;
    }

    /**
     * @param projects
     *            New project list
     */
    public void setProjects(final List<Project> projects)
    {
        this.projects = projects;
    }
}
