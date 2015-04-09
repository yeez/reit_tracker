package com.reit.service;

import java.util.List;

import com.reit.dao.ProjectDAOImpl;
import com.reit.entities.Project;

public class ProjectService {

	private static ProjectDAOImpl projectDaoImpl;

	public ProjectService() {
		projectDaoImpl = new ProjectDAOImpl();
	}

	public void persist(Project project) {
		projectDaoImpl.openCurrentSessionWithTransaction();
		projectDaoImpl.persist(project);
		projectDaoImpl.closeCurrentSessionWithTransaction();
	}

	public void update(Project project) {
		projectDaoImpl.openCurrentSessionWithTransaction();
		projectDaoImpl.update(project);
		projectDaoImpl.closeCurrentSessionWithTransaction();
	}

	public Project findById(String id) {
		projectDaoImpl.openCurrentSession();
		Project project= projectDaoImpl.findById(id);
		projectDaoImpl.closeCurrentSession();
		return project;
	}

	public void delete(String id) {
		projectDaoImpl.openCurrentSessionWithTransaction();
		Project project= projectDaoImpl.findById(id);
		projectDaoImpl.delete(project);
		projectDaoImpl.closeCurrentSessionWithTransaction();
	}

	public List<Project> findAll() {
		projectDaoImpl.openCurrentSession();
		List<Project> projects= projectDaoImpl.findAll();
		projectDaoImpl.closeCurrentSession();
		return projects;
	}

	public void deleteAll() {
		projectDaoImpl.openCurrentSessionWithTransaction();
		projectDaoImpl.deleteAll();
		projectDaoImpl.closeCurrentSessionWithTransaction();
	}

	public ProjectDAOImpl getProjectDaoImpl() {
		return projectDaoImpl;
	}
}
