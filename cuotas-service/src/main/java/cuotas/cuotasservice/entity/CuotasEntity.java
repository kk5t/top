package cuotas.cuotasservice.entity;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.time.LocalDate;

@Entity
@Table(name = "cuotas")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CuotasEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "idCuota", unique = true, nullable = false)
    private Long idCuota;
    private int monto;
    private LocalDate fechaEmision;
    private LocalDate fechaPago;
    private LocalDate fechaVencimiento;
    private String estado;
    private int descuento;
    private int interes;
    private int descuentoNotas;
    private int cant_cuotas;
    private String rut;
}

