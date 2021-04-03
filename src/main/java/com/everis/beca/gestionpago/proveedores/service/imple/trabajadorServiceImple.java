package com.everis.beca.gestionpago.proveedores.service.imple;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.everis.beca.gestionpago.proveedores.dto.TrabajadorDTo;
import com.everis.beca.gestionpago.proveedores.entity.trabajadorEntity;
import com.everis.beca.gestionpago.proveedores.repository.trabajadorRepository;
import com.everis.beca.gestionpago.proveedores.service.trabajadorService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class trabajadorServiceImple implements trabajadorService{

	@Autowired
	private trabajadorRepository trabajadorRepositorio;
	
	@Override
	public List<TrabajadorDTo> obtenerTrabajador(Integer id) {

		List<TrabajadorDTo> trabajadorDTO = new ArrayList<>();
		List<trabajadorEntity> trabaj = trabajadorRepositorio.obtenerTrabajador(id);
		
		for (trabajadorEntity work : trabaj) {
			
			TrabajadorDTo trabajadorDtop = new TrabajadorDTo();
			
			trabajadorDtop.setTrabajador_id(work.getTrabajador_id());
			trabajadorDtop.setTipo_tip_id(work.getTipo_tip_id());
			trabajadorDtop.setPersona_per_id(work.getPersona_per_id());
			
			trabajadorDTO.add(trabajadorDtop); 
		}
		
		return trabajadorDTO;
	}

}
