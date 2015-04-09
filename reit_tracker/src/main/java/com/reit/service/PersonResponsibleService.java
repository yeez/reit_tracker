package com.reit.service;

import java.util.List;

import com.reit.dao.PersonResponsibleDAOImpl;
import com.reit.entities.PersonResponsible;

public class PersonResponsibleService {
	
	private static PersonResponsibleDAOImpl personResponsibleDaoImpl;

	public PersonResponsibleService() {
		personResponsibleDaoImpl = new PersonResponsibleDAOImpl();
	}

	public void persist(PersonResponsible personResponsible) {
		personResponsibleDaoImpl.openCurrentSessionWithTransaction();
		personResponsibleDaoImpl.persist(personResponsible);
		personResponsibleDaoImpl.closeCurrentSessionWithTransaction();
	}

	public void update(PersonResponsible personResponsible) {
		personResponsibleDaoImpl.openCurrentSessionWithTransaction();
		personResponsibleDaoImpl.update(personResponsible);
		personResponsibleDaoImpl.closeCurrentSessionWithTransaction();
	}

	public PersonResponsible findById(String id) {
		personResponsibleDaoImpl.openCurrentSession();
		PersonResponsible PersonResponsible= personResponsibleDaoImpl.findById(id);
		personResponsibleDaoImpl.closeCurrentSession();
		return PersonResponsible;
	}

	public void delete(String id) {
		personResponsibleDaoImpl.openCurrentSessionWithTransaction();
		PersonResponsible personResponsible= personResponsibleDaoImpl.findById(id);
		personResponsibleDaoImpl.delete(personResponsible);
		personResponsibleDaoImpl.closeCurrentSessionWithTransaction();
	}

	public List<PersonResponsible> findAll() {
		personResponsibleDaoImpl.openCurrentSession();
		List<PersonResponsible> personResponsibles= personResponsibleDaoImpl.findAll();
		personResponsibleDaoImpl.closeCurrentSession();
		return personResponsibles;
	}

	public void deleteAll() {
		personResponsibleDaoImpl.openCurrentSessionWithTransaction();
		personResponsibleDaoImpl.deleteAll();
		personResponsibleDaoImpl.closeCurrentSessionWithTransaction();
	}

	public PersonResponsibleDAOImpl getPersonResponsibleDaoImpl() {
		return personResponsibleDaoImpl;
	}

}
