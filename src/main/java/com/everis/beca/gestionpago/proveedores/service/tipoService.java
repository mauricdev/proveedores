package com.everis.beca.gestionpago.proveedores.service;

import java.util.List;

import com.everis.beca.gestionpago.proveedores.dto.TipoDto;

public interface tipoService {
	public List<TipoDto> obtenerTipo(Integer id);
}
