package com.factura_ariel_aguirre.facturacion_ariel_aguirre.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.Persona;

@Repository
public interface PersonaRepository  extends JpaRepository<Persona, Integer>{

    //Método para buscar el DNI

    Persona findByDni(String dni);
    

}
