package com.everis.beca.gestionpago.proveedores.dto;

import java.io.Serializable;

import lombok.Data;


@Data
public class TipoDto implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer tip_id;
	private String tip_cargo;

}