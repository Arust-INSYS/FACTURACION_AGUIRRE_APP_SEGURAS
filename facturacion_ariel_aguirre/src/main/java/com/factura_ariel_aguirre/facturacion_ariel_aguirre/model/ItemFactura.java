package com.factura_ariel_aguirre.facturacion_ariel_aguirre.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name  = "item_factura")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ItemFactura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idItemFactura;

    @ManyToOne
    @JoinColumn(name = "id_producto", nullable = false)
    private Producto producto;

    @Column(nullable = false)
    private Integer cantidad;

    @Column(nullable = false)
    private Double precio;

    @Column(nullable = false)
    private Double subtotal;

}
