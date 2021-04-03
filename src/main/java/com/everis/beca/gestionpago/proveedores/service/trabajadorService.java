package com.everis.beca.gestionpago.proveedores.service;

import java.util.List;

import com.everis.beca.gestionpago.proveedores.dto.TrabajadorDTo;

public interface trabajadorService {
	public List<TrabajadorDTo> obtenerTrabajador(Integer id);
}
