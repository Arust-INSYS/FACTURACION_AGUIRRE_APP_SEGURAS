package com.factura_ariel_aguirre.facturacion_ariel_aguirre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.Factura;

@Repository
public interface FacturaRepository extends JpaRepository<Factura, Integer> {
    //Método para buscar facturas por RUC
    List<Factura> findByRuc(String ruc);

}
