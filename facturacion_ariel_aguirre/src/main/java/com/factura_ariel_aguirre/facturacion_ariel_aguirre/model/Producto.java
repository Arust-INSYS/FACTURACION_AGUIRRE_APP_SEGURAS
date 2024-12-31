package com.factura_ariel_aguirre.facturacion_ariel_aguirre.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name  = "producto")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProducto;

    @Column(nullable = false)
    private Integer stock;

    @Column(nullable = false)
    private Double precioUnitario;

    @Column(nullable = false)
    private String unidad;

    @ManyToOne
    @JoinColumn(name = "id_clasifiacionj", nullable = false)
    private Clasificacion clasificacion;

    @ManyToOne
    @JoinColumn(name="id_proveedor", nullable = false)
    private Proveedor proveedor;

    @Column(nullable = false)
    private Boolean iva;

}
