package com.cibertec.edu.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cibertec.edu.models.Personal;

@Repository
public interface IPersonalRepository extends JpaRepository<Personal, Integer> {

	public List<Personal> findAll();
	
	List<Personal> findByNombre(String nombre);
}
