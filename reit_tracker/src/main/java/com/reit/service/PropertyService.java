package com.reit.service;

import java.util.List;

import com.reit.dao.PropertyDAOImpl;
import com.reit.entities.Property;

public class PropertyService {
	
	private static PropertyDAOImpl propertyDaoImpl;

	public PropertyService() {
		propertyDaoImpl = new PropertyDAOImpl();
	}

	public void persist(Property property) {
		propertyDaoImpl.openCurrentSessionWithTransaction();
		propertyDaoImpl.persist(property);
		propertyDaoImpl.closeCurrentSessionWithTransaction();
	}

	public void update(Property property) {
		propertyDaoImpl.openCurrentSessionWithTransaction();
		propertyDaoImpl.update(property);
		propertyDaoImpl.closeCurrentSessionWithTransaction();
	}

	public Property findById(String id) {
		propertyDaoImpl.openCurrentSession();
		Property property= propertyDaoImpl.findById(id);
		propertyDaoImpl.closeCurrentSession();
		return property;
	}

	public void delete(String id) {
		propertyDaoImpl.openCurrentSessionWithTransaction();
		Property property= propertyDaoImpl.findById(id);
		propertyDaoImpl.delete(property);
		propertyDaoImpl.closeCurrentSessionWithTransaction();
	}

	public List<Property> findAll() {
		propertyDaoImpl.openCurrentSession();
		List<Property> propertys= propertyDaoImpl.findAll();
		propertyDaoImpl.closeCurrentSession();
		return propertys;
	}

	public void deleteAll() {
		propertyDaoImpl.openCurrentSessionWithTransaction();
		propertyDaoImpl.deleteAll();
		propertyDaoImpl.closeCurrentSessionWithTransaction();
	}

	public PropertyDAOImpl getPropertyDaoImpl() {
		return propertyDaoImpl;
	}

}
