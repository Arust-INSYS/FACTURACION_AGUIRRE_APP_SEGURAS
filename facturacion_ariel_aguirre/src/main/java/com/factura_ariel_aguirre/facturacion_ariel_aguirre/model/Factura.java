package com.factura_ariel_aguirre.facturacion_ariel_aguirre.model;
import java.util.Date;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name ="factura")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idFactura;

    @ManyToOne
    @JoinColumn(name = "id_persona", nullable = false)
    private Persona persona;

    @Column(nullable = false)
    private String ruc;

    @Column(nullable = false)
    private Double total;

    @Column
    private Double descuento;

    @Column(nullable = false)
    private Date fecha;

    @ManyToOne
    @JoinColumn(name = "id_tipo_pago", nullable = false)
    private TipoPago tipoPago;

}
