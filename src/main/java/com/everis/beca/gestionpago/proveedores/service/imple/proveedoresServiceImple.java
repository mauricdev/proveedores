package com.everis.beca.gestionpago.proveedores.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.gestionpago.proveedores.dto.proveedoresDTo;
import com.everis.beca.gestionpago.proveedores.entity.proveedorEntity;
import com.everis.beca.gestionpago.proveedores.repository.proveedorRepository;
import com.everis.beca.gestionpago.proveedores.service.proveedorService;


import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class proveedoresServiceImple implements proveedorService {

	@Autowired
	private proveedorRepository proveedorRepositorio;
	
	@Override
	public List<proveedoresDTo> obtenerProveedor(Integer id) {
		List<proveedoresDTo> proveedorDto = new ArrayList<>();

		List<proveedorEntity> prove = proveedorRepositorio.obtenerProveedores(id);
		

		for (proveedorEntity provedor : prove) {
			proveedoresDTo proveedorDTO = new proveedoresDTo();

			proveedorDTO.setProv_id(provedor.getProv_id());
			proveedorDTO.setProv_nombre(provedor.getProv_nombre());
			proveedorDTO.setProv_razon_social(provedor.getProv_razon_social());
			proveedorDTO.setProv_rut(provedor.getProv_rut());
			proveedorDTO.setProv_email(provedor.getProv_email());
			proveedorDto.add(proveedorDTO); 
		}

		return proveedorDto;
	}

}
