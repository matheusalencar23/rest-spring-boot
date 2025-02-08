package io.github.matheusalencar23.services;

import java.util.List;
import java.util.logging.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.matheusalencar23.exceptions.ResourceNotFoundException;
import io.github.matheusalencar23.model.Person;
import io.github.matheusalencar23.repositories.PersonRepository;

@Service
public class PersonService {
	private Logger logger = Logger.getLogger(PersonService.class.getName());

	@Autowired
	PersonRepository repository;
	
	public Person findById(Long id) {
		logger.info("Finding one person!");
		
		Person person = new Person();
		person.setFirstName("Marcos");
		person.setLastName("Silva");
		person.setAddress("Fortaleza - Ceará - Brasil");
		person.setGender("Male");
		
		return repository
				.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for ID: " + id + "."));
	}
	
	public List<Person> findAll() {
		logger.info("Finding all people!");
		return repository.findAll();
	}
	
	public Person create(Person person) {
		logger.info("Creating one person!");
		return repository.save(person);
	}
	
	public Person update(Person person) {
		logger.info("Updating one person!");
		
		Person entity = repository
				.findById(person.getId())
				.orElseThrow(() -> new ResourceNotFoundException("No records found for ID: " + person.getId() + "."));
			
		entity.setFirstName(person.getFirstName());
		entity.setLastName(person.getLastName());
		entity.setAddress(person.getAddress());
		entity.setGender(person.getGender());
			
		return repository.save(entity);
	}
	
	public void delete(Long id) {
		logger.info("Deleting one person!");
		Person entity = repository
				.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("No records found for ID: " + id + "."));
	
		repository.delete(entity);
	}
	
}
