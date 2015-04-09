package com.reit.dao;

import java.util.List;

import com.reit.entities.PersonResponsible;

public class PersonResponsibleDAOImpl extends HbUtil implements EntityDAO<PersonResponsible, String>{

	public PersonResponsibleDAOImpl(){
	}

	@Override
	public void persist(PersonResponsible personResponsible) {
		getCurrentSession().save(personResponsible);
	}

	@Override
	public void update(PersonResponsible personResponsible) {
		getCurrentSession().update(personResponsible);
	}

	@Override
	public PersonResponsible findById(String id) {
		PersonResponsible personResponsible= (PersonResponsible) getCurrentSession().get(PersonResponsible.class, id);
		return personResponsible;
	}

	@Override
	public void delete(PersonResponsible personResponsible) {
		getCurrentSession().delete(personResponsible);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<PersonResponsible> findAll() {
		List<PersonResponsible> personResponsibles = (List<PersonResponsible>) getCurrentSession().createQuery("from PersonResponsible").list();
		return personResponsibles;
	}

	@Override
	public void deleteAll() {
		List<PersonResponsible> personResponsibleList = findAll();
		for (PersonResponsible personResponsible : personResponsibleList) {
			delete(personResponsible);
		}
	}

}
