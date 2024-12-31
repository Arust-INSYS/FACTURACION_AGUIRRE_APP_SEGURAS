package com.factura_ariel_aguirre.facturacion_ariel_aguirre.model;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "tipo_pago")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TipoPago {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTipoPago;

    @Column(nullable = false)
    private String descripcion;


}
