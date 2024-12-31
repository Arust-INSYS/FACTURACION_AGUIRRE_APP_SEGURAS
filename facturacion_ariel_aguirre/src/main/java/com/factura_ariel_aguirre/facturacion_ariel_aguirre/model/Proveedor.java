package com.factura_ariel_aguirre.facturacion_ariel_aguirre.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "proveedor")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Proveedor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProveedor;

    @Column(nullable = false, unique = true)
    private String ruc;

    @Column(nullable = false)
    private String telefono;

    @Column(nullable = false)
    private String pais;

    @Column(nullable = false)
    private String correo;

    @Column(nullable = false)
    private String moneda;

}
