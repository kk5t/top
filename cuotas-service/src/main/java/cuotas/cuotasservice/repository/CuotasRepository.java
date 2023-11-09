package cuotas.cuotasservice.repository;

import cuotas.cuotasservice.entity.CuotasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface CuotasRepository extends JpaRepository<CuotasEntity, Long> {
    List<CuotasEntity> findByRut(String rut);

    List<CuotasEntity> findByEstado(String estado);

    CuotasEntity findByIdCuota(long idCuota);

}
