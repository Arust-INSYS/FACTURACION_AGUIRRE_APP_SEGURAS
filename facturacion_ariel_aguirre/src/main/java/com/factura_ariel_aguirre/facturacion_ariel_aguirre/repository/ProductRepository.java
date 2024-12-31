package com.factura_ariel_aguirre.facturacion_ariel_aguirre.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.Producto;

@Repository
public interface ProductRepository extends JpaRepository<Producto, Integer> {
    //Método para buscar productos por clasificación
    List<Producto> findByClasificacionIdClasificacion(Integer idClasificacion);

    //Método para buscarproduxctos por proveedor
    List<Producto> findByProveedorIdProveedor(Integer idProveedor);

}
