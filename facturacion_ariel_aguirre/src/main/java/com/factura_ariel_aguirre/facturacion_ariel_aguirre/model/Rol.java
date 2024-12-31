package com.factura_ariel_aguirre.facturacion_ariel_aguirre.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "rol")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rol {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRol;

    @Column (nullable = false, unique = true)
    private String rol;

    @Column(nullable = false)
    private Boolean estado;

}
