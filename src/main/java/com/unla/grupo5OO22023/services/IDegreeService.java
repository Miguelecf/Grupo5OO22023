package com.unla.grupo5OO22023.services;
import java.util.List;

import com.unla.grupo5OO22023.entities.Degree;
import com.unla.grupo5OO22023.models.DegreeModel;


public interface IDegreeService {

	public List<Degree> getAll();

	public DegreeModel insertOrUpdate(DegreeModel degreeModel);

	public boolean remove(int id);
}

