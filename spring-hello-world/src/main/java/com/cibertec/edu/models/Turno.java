package com.cibertec.edu.models;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Turno implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "turno_id")
	int id;
	
	@Column(name= "turno_descripcion")
	String description;
	
	@Column(name= "turno_fecha")
	Date fecha;
	
	@Column(name= "turno_create_date")
	Date fechaCreacion;
	
	@ManyToOne
	@JoinColumn(name= "turno_doctor_id")
	Personal personal;
	
	@ManyToOne
	@JoinColumn(name= "turno_paciente_id")
	Paciente paciente;	
}
