package com.factura_ariel_aguirre.facturacion_ariel_aguirre.service;

import java.util.List;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.Persona;

public interface PersonaService {
    Persona crearPersona(Persona persona);
    Persona obtenerPorDni(String dni);
    Persona actualizarPersona(Integer id, Persona persona);
    void eliminarPersona(Integer id);

    List<Persona> listarPersona();

}
