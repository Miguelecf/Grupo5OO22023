package com.unla.grupo5OO22023.services.implementation;
import java.util.ArrayList;
import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.unla.grupo5OO22023.entities.Person;
import com.unla.grupo5OO22023.models.PersonModel;
import com.unla.grupo5OO22023.repositories.IPersonRepository;
import com.unla.grupo5OO22023.services.IPersonService;


@Service("personService")
public class PersonService implements IPersonService {

	@Autowired
	@Qualifier("personRepository")
	private IPersonRepository personRepository;

	private ModelMapper modelMapper = new ModelMapper();

	@Override
	public List<Person> getAll() {
		return personRepository.findAll();
	}

	@Override
	public PersonModel insertOrUpdate(Person person) {
		Person personNew = personRepository.save(person);
		return modelMapper.map(personNew, PersonModel.class);
	}

	@Override
	public boolean remove(int id) {
		try {
			personRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			return false;
		}
	}

	@Override
	public Person findById(int id) {
		return personRepository.findById(id);
	}

	@Override
	public PersonModel findByName(String name) {
		return modelMapper.map(personRepository.findByName(name), PersonModel.class);
	}

	@Override
	public List<PersonModel> findByDegreeName(String degreeName) {
		List<PersonModel> models = new ArrayList<>();
		for (Person person : personRepository.findByDegreeName(degreeName)) {
			models.add(modelMapper.map(person, PersonModel.class));
		}
		return models;
	}
}
