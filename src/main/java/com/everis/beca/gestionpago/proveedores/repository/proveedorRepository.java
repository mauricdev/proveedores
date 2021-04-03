package com.everis.beca.gestionpago.proveedores.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.everis.beca.gestionpago.proveedores.entity.proveedorEntity;



public interface proveedorRepository extends JpaRepository<proveedorEntity, Integer> {

	@Query(value = "SELECT * FROM proveedor.proveedor WHERE prov_id  =:prov_id LIMIT 1", nativeQuery = true)
	public List<proveedorEntity> obtenerProveedores(@Param("prov_id")Integer prov_id);


}
