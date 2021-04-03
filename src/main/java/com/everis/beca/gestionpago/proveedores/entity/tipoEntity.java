package com.everis.beca.gestionpago.proveedores.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "tipo")
public class tipoEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "tip_id")
	private Integer tip_id;
	
	@Column(name = "tip_cargo")
	private String tip_cargo;
	
	
}