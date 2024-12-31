package com.factura_ariel_aguirre.facturacion_ariel_aguirre.controller;

import com.factura_ariel_aguirre.facturacion_ariel_aguirre.model.Usuario;
import com.factura_ariel_aguirre.facturacion_ariel_aguirre.service.UsuarioService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {
    private final UsuarioService usuarioService;

    public UsuarioController(UsuarioService usuarioService) {
        this.usuarioService = usuarioService;
    }

    @PostMapping
    public ResponseEntity<Usuario> crearUsuario(@RequestBody Usuario usuario) {
        return ResponseEntity.ok(usuarioService.crearUsuario(usuario));
    }

    @GetMapping("/{id}")
    public ResponseEntity<Usuario> obtenerUsuarioPorId(@PathVariable Integer id) {
        return ResponseEntity.ok(usuarioService.obtenerPorId(id));
    }

    @PostMapping("/verificar")
    public ResponseEntity<Boolean> verificarUsuario(@RequestParam String user, @RequestParam String password) {
        return ResponseEntity.ok(usuarioService.verificarUsuario(user, password));
    }

}
