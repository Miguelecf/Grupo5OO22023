package com.unla.grupo5OO22023.services;
import java.util.List;

import com.unla.grupo5OO22023.entities.Person;
import com.unla.grupo5OO22023.models.PersonModel;


public interface IPersonService {

	public List<Person> getAll();

	public Person findById(int id);

	public PersonModel findByName(String name);

	public PersonModel insertOrUpdate(Person person);

	public boolean remove(int id);

	public List<PersonModel> findByDegreeName(String degreeName);
}

