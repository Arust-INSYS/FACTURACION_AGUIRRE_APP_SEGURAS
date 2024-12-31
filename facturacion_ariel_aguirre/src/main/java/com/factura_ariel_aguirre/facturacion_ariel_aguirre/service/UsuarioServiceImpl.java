package com.factura_ariel_aguirre.facturacion_ariel_aguirre.service;

import org.springframework.stereotype.Service;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.Usuario;
import com.factura_ariel_aguirre.facturacion_ariel_aguirre.repository.UsuarioRepository;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    private final UsuarioRepository usuarioRepository;

    public UsuarioServiceImpl(UsuarioRepository usuarioRepository){
        this.usuarioRepository = usuarioRepository;

    }
    @Override
    public Usuario crearUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @Override
    public Usuario obtenerPorId(Integer id) {
        return usuarioRepository.findById(id)
        .orElseThrow(()-> new RuntimeException("Usuario no encontrado"));
    }

    @Override
    public boolean verificarUsuario(String user, String password) {
        return usuarioRepository.existsByUserAndPassword(user, password);
    }


}
