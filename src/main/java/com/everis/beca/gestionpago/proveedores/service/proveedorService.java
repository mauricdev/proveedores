package com.everis.beca.gestionpago.proveedores.service;

import java.util.List;

import com.everis.beca.gestionpago.proveedores.dto.proveedoresDTo;


public interface proveedorService {
	public List<proveedoresDTo> obtenerProveedor(Integer id);
}
