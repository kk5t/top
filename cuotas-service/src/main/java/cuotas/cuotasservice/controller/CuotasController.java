package cuotas.cuotasservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import cuotas.cuotasservice.service.CuotasService;
import cuotas.cuotasservice.entity.CuotasEntity;
import java.util.List;

@RequestMapping("/cuotas")
@RestController
public class CuotasController {

    @Autowired
    CuotasService cuotasService;

    @GetMapping("/{rut}")
    public ResponseEntity<List<CuotasEntity>> cuotas(@PathVariable("rut") String rut){
        List<CuotasEntity> cuotasEntities = cuotasService.obtenerCuotasPorRut(rut);
        return ResponseEntity.ok(cuotasEntities);
    }

    @PostMapping("/crear")
    public ResponseEntity<CuotasEntity> crear(@RequestBody CuotasEntity cuotas) {
        cuotasService.crearCuota(cuotas);
        return ResponseEntity.ok(null);
    }

    @PostMapping("/pagar/{idCuota}")
    public void crearCuotas(@PathVariable("idCuota") Long idCuota) {
        cuotasService.pagarCuotas(idCuota);
    }
    @PostMapping("/cobrar")
    public void generarInteres() {
        cuotasService.generaCuotasAtrasadas();
    }
}
