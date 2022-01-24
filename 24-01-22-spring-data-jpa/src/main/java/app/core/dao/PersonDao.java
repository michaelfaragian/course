package app.core.dao;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import app.core.entities.Person;

@Component
@Transactional // start an entityManager session on each method call and close it at the end
public class PersonDao {
	
	@Autowired
	private EntityManager em; // an container for persisting entities

	// CREATE
	public void addPerson (Person person) {
		em.persist(person);
	}
	
	// READ
	public Person find (int personID) {
		Person p = em.find(Person.class, personID);
		return p;
	}
	
	// DELETE
	public void deleteBtId(int personID) {
		Person p = find(personID);
		em.remove(p);
	}
	
	// UPDATE
	public void updatePerson (Person person) {
		Person personFromDb = find(person.getId());
		personFromDb.setName(person.getName());
		personFromDb.setAge(person.getAge());
	}
}
