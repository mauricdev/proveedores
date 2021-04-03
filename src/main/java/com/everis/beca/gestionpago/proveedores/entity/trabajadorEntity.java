package com.everis.beca.gestionpago.proveedores.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "trabajador")
public class trabajadorEntity  implements java.io.Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name = "trabajador_id")
	private Integer trabajador_id;
	
	@Column(name = "persona_per_id")
	private Integer persona_per_id;
	
	@Column(name = "tipo_tip_id")
	private Integer tipo_tip_id;
	
}