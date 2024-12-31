package com.factura_ariel_aguirre.facturacion_ariel_aguirre.service;

import java.util.List;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.Factura;

public interface FacturaService {
     Factura crearFactura(Factura factura);

    Factura obtenerPorId(Integer id);

    List<Factura> listarFacturas();

    List<Factura> obtenerPorRuc(String ruc);

    void eliminarFactura(Integer id);

}
