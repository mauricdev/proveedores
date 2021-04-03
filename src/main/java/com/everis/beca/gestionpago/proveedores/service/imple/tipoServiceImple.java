package com.everis.beca.gestionpago.proveedores.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.gestionpago.proveedores.dto.TipoDto;
import com.everis.beca.gestionpago.proveedores.dto.proveedoresDTo;
import com.everis.beca.gestionpago.proveedores.entity.proveedorEntity;
import com.everis.beca.gestionpago.proveedores.entity.tipoEntity;
import com.everis.beca.gestionpago.proveedores.repository.tipoRepository;
import com.everis.beca.gestionpago.proveedores.service.tipoService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class tipoServiceImple  implements tipoService{

	@Autowired
	private tipoRepository tipoRepositorio;
	
	@Override
	public List<TipoDto> obtenerTipo(Integer id) {
		List<TipoDto> tipoDto = new ArrayList<>();
		List<tipoEntity> tipo = tipoRepositorio.obtenerTipo(id);

		for (tipoEntity tipos : tipo) {
			TipoDto tipDTO = new TipoDto();

			tipDTO.setTip_cargo(tipos.getTip_cargo());
			tipDTO.setTip_id(tipos.getTip_id());
			tipoDto.add(tipDTO); 
		}

		return tipoDto;
	}
	
	


}
