package com.reit.dao;

import java.util.List;

import com.reit.entities.Property;

public class PropertyDAOImpl extends HbUtil implements EntityDAO<Property, String> {
	
	public PropertyDAOImpl(){

	}

	@Override
	public void persist(Property property) {
		getCurrentSession().save(property);
	}

	@Override
	public void update(Property property) {
		getCurrentSession().update(property);
	}

	@Override
	public Property findById(String id) {
		Property property= (Property) getCurrentSession().get(Property.class, id);
		return property;
	}

	@Override
	public void delete(Property property) {
		getCurrentSession().delete(property);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Property> findAll() {
		List<Property> propertys = (List<Property>) getCurrentSession().createQuery("from Property").list();
		return propertys;
	}

	@Override
	public void deleteAll() {
		List<Property> propertyList = findAll();
		for (Property property : propertyList) {
			delete(property);
		}
	}
}
