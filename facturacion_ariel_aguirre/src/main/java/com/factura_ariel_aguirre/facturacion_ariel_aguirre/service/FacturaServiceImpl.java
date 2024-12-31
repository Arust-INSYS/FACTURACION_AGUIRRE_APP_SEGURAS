package com.factura_ariel_aguirre.facturacion_ariel_aguirre.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.Factura;
import com.factura_ariel_aguirre.facturacion_ariel_aguirre.repository.FacturaRepository;

@Service
public class FacturaServiceImpl implements FacturaService{
    private final FacturaRepository facturaRepository;

    public FacturaServiceImpl(FacturaRepository facturaRepository) {
        this.facturaRepository = facturaRepository;
    }

    @Override
    public Factura crearFactura(Factura factura) {
        return facturaRepository.save(factura);
    }

    @Override
    public Factura obtenerPorId(Integer id) {
        return facturaRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Factura no encontrada"));
    }

    @Override
    public List<Factura> listarFacturas() {
        return facturaRepository.findAll();
    }

    @Override
    public List<Factura> obtenerPorRuc(String ruc) {
        return facturaRepository.findByRuc(ruc);
    }

    @Override
    public void eliminarFactura(Integer id) {
        facturaRepository.deleteById(id);
    }


}
