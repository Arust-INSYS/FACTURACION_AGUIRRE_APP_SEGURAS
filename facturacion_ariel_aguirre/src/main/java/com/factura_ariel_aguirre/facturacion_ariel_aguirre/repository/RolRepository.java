package com.factura_ariel_aguirre.facturacion_ariel_aguirre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.Rol;

@Repository
public interface RolRepository extends JpaRepository<Rol, Integer> {
    // Método personalizado para verificar si un ron existe
    boolean existsByRol(String rol);
    

}
