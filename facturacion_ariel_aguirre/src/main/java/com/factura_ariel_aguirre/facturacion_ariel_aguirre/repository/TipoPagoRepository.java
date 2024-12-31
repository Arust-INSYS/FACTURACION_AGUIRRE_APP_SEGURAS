package com.factura_ariel_aguirre.facturacion_ariel_aguirre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.TipoPago;

@Repository
public interface TipoPagoRepository extends JpaRepository<TipoPago, Integer>{
    //

}
