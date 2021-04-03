package com.everis.beca.gestionpago.proveedores.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class proveedoresDTo implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer prov_id;
	private String prov_nombre;
	private String prov_rut;
	private String prov_razon_social;
	private String prov_email;

}