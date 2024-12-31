package com.factura_ariel_aguirre.facturacion_ariel_aguirre.service;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.Usuario;

public interface UsuarioService {

    Usuario crearUsuario(Usuario usuario);

    Usuario obtenerPorId(Integer id);

    boolean verificarUsuario(String user, String password);

}
