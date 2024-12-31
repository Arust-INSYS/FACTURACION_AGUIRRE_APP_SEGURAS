package com.factura_ariel_aguirre.facturacion_ariel_aguirre.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "clasificacion")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Clasificacion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClasificacion;

    @Column(nullable = false)
    private String grupo;

}
