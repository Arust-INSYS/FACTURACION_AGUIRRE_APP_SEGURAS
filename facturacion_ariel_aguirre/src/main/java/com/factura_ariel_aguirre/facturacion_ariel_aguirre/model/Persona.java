package com.factura_ariel_aguirre.facturacion_ariel_aguirre.model;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name  = "persona")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idPersona;

    @Column(nullable = false)
    private String nombre;

    @Column(nullable = false)
    private String apellido;

    @Column(nullable = false)
    private String dni;

    @Column(nullable = false)
    private String celular;

    @Column(nullable = false, unique = true)
    private String correo;


}
