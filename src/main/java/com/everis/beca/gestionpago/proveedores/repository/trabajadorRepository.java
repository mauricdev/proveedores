package com.everis.beca.gestionpago.proveedores.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.everis.beca.gestionpago.proveedores.entity.trabajadorEntity;


public interface trabajadorRepository extends JpaRepository<trabajadorEntity, Integer> {

	@Query(value = "SELECT * FROM proveedor.trabajador WHERE trabajador_id =:trabajador_id  LIMIT 1", nativeQuery = true)
	public List<trabajadorEntity> obtenerTrabajador(@Param("trabajador_id")Integer trabajador_id);
}