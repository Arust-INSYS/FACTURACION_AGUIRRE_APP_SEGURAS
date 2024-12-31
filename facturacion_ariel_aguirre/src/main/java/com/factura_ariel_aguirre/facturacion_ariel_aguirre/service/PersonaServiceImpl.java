package com.factura_ariel_aguirre.facturacion_ariel_aguirre.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.Persona;
import com.factura_ariel_aguirre.facturacion_ariel_aguirre.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {
    private final PersonaRepository personaRepository;

    public PersonaServiceImpl(PersonaRepository personaRepository){
        this.personaRepository = personaRepository;
        
    }

    @Override
    public Persona crearPersona(Persona persona) {
        return personaRepository.save(persona);
    }

    @Override
    public Persona obtenerPorDni(String dni) {
        return personaRepository.findByDni(dni);
    }

    @Override
    public Persona actualizarPersona(Integer id, Persona persona) {
        Optional<Persona> personaExistente = personaRepository.findById(id);
        if(personaExistente.isPresent()){
            persona.setIdPersona(id);
            return personaRepository.save(persona);

        }
        throw new RuntimeException("Persona no encontrada");
    }

    @Override
    public void eliminarPersona(Integer id) {
        personaRepository.deleteById(id);
        
    }

    @Override
    public List<Persona> listarPersona() {
        return personaRepository.findAll();
    }
    

}
