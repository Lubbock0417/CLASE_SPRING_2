package com.cibertec.edu.models;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "Paciente")
public class Paciente implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "paciente_id")
	int id;
	
	@Column(name= "paciente_nombre")
	String nombre;
	
	@Column(name= "paciente_dni")
	String dni;
	
	@Column(name= "paciente_nacimiento")
	Date fechaNacimiento;
	
	@OneToMany(mappedBy = "paciente")
	List<Turno> turnos;
}
