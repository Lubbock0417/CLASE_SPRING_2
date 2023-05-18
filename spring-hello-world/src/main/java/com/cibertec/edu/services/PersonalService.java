package com.cibertec.edu.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cibertec.edu.models.Personal;
import com.cibertec.edu.repositories.IPersonalRepository;

@Service
public class PersonalService {
	
	@Autowired
	private IPersonalRepository personalRepository;
	
	public List<Personal> buscarPorNombre(String nombre) {
		return personalRepository.findByNombre(nombre);
	}
	
	public List<Personal> buscarTodos() {
		return personalRepository.findAll();
	}
	
	public Personal getOnePersonal(Integer id) {
		Optional<Personal> personalResult = personalRepository.findById(id);
		return personalResult.isPresent()? personalResult.get() : null;
	}
	
	public Personal guardarPersonal(Personal newPersonal) {
		return personalRepository.save(newPersonal);
	}
}
