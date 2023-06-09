package com.cibertec.edu.models;

import java.io.Serializable;
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
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Personal")
public class Personal implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "personal_id")
	int id;
	
	@Column(name= "personal_nombre")
	String nombre;
	
	@Column(name= "personal_cargo")
	String cargo;
	
	@Column(name= "personal_estado")
	String estado;
	
	@OneToMany(mappedBy = "personal")
	List<Turno> turnos;
}
