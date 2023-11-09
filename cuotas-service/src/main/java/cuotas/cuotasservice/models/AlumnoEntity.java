package cuotas.cuotasservice.models;

import javax.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Table(name="alumno")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlumnoEntity {
    @Id
    // @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "rut", unique = true, nullable = false, length = 10)
    private String rut;

    private String apellidos;
    private String nombres;
    private String fecha_nacimiento;
    private String tipo_colegio;
    private String nombre_colegio;
    private int ano_egreso;
    private String tipo_pago;
    private int arancel;
    //private String tipoPago -> para saber con que pago el cliente

}
