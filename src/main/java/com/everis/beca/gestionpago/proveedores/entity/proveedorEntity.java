package com.everis.beca.gestionpago.proveedores.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "proveedor")
public class proveedorEntity implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "prov_id")
	private Integer prov_id;
	
	@Column(name = "prov_nombre")
	private String prov_nombre;
	
	@Column(name = "prov_rut")
	private String prov_rut;
	
	@Column(name = "prov_razon_social")
	private String prov_razon_social;
	
	@Column(name = "prov_email")
	private String prov_email;
	
}
