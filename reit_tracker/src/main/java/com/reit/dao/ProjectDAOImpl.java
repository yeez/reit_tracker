package com.reit.dao;

import java.util.List;

import com.reit.entities.Project;

public class ProjectDAOImpl extends HbUtil implements EntityDAO<Project, String>{

	public ProjectDAOImpl(){

	}

	@Override
	public void persist(Project project) {
		getCurrentSession().save(project);
	}

	@Override
	public void update(Project project) {
		getCurrentSession().update(project);
	}

	@Override
	public Project findById(String id) {
		Project project= (Project) getCurrentSession().get(Project.class, id);
		return project;
	}

	@Override
	public void delete(Project project) {
		getCurrentSession().delete(project);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Project> findAll() {
		List<Project> projects = (List<Project>) getCurrentSession().createQuery("from Project").list();
		return projects;
	}

	@Override
	public void deleteAll() {
		List<Project> projectList = findAll();
		for (Project project : projectList) {
			delete(project);
		}
	}

}
