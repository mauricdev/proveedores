package com.everis.beca.gestionpago.proveedores.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class TrabajadorDTo implements Serializable{

	private static final long serialVersionUID = 1L;

	private Integer trabajador_id;
	private Integer persona_per_id;
	private Integer tipo_tip_id;
	

}