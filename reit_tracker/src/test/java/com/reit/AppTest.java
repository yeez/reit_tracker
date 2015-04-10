package com.reit;
 
import junit.framework.TestCase;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.reit.entities.PersonResponsible;
import com.reit.entities.Project;
import com.reit.entities.Property;
import com.reit.entities.Property.PropertyType;
 
/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
 
	public void testApp() {
		SessionFactory sessionFactory = new Configuration().configure()
				.buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		PersonResponsible personResponsible = new PersonResponsible ("Yasser Rep");
		Property property = new Property(PropertyType.APPARTMENT, 1009, "Yasser");
		Project project = new Project("test", personResponsible, property );
		
		session.save(personResponsible);
		session.save(property);
		session.save(project);
 
		session.getTransaction().commit();
		session.close();
	}
}