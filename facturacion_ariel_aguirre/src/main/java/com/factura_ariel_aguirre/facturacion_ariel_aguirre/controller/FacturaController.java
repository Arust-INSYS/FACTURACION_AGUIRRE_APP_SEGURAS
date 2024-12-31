package com.factura_ariel_aguirre.facturacion_ariel_aguirre.controller;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.Factura;
import com.factura_ariel_aguirre.facturacion_ariel_aguirre.service.FacturaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/facturas")
public class FacturaController {
    private final FacturaService facturaService;

    public FacturaController(FacturaService facturaService) {
        this.facturaService = facturaService;
    }

    @PostMapping
    public ResponseEntity<Factura> crearFactura(@RequestBody Factura factura) {
        return ResponseEntity.ok(facturaService.crearFactura(factura));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Factura> obtenerFacturaPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(facturaService.obtenerPorId(id));
    }

    @GetMapping
    public ResponseEntity<List<Factura>> listarFacturas() {
        return ResponseEntity.ok(facturaService.listarFacturas());
    }

    @GetMapping("/ruc/{ruc}")
    public ResponseEntity<List<Factura>> obtenerFacturasPorRuc(@PathVariable String ruc) {
        return ResponseEntity.ok(facturaService.obtenerPorRuc(ruc));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarFactura(@PathVariable Integer id) {
        facturaService.eliminarFactura(id);
        return ResponseEntity.noContent().build();
    }

}
