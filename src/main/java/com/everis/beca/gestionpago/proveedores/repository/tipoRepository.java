package com.everis.beca.gestionpago.proveedores.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.everis.beca.gestionpago.proveedores.entity.tipoEntity;



public interface tipoRepository extends JpaRepository<tipoEntity, Integer> {

	@Query(value = "SELECT * FROM proveedor.tipo WHERE tip_id =:tip_id  LIMIT 1", nativeQuery = true)
	public List<tipoEntity> obtenerTipo(@Param("tip_id")Integer tip_id);
}
