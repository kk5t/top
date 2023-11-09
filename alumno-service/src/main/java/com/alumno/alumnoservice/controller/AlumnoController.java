package com.alumno.alumnoservice.controller;

import com.alumno.alumnoservice.entity.AlumnoEntity;
import com.alumno.alumnoservice.service.AlumnoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/alumno")
@RestController
public class AlumnoController {
    @Autowired
    AlumnoService alumnoService;


    @GetMapping()
    public ResponseEntity<List<AlumnoEntity>> todos(){
        List<AlumnoEntity> alumnos = alumnoService.getAll();
        return ResponseEntity.ok(alumnos);
    }

    @PostMapping()
    public ResponseEntity<AlumnoEntity> save(@RequestBody AlumnoEntity alumnoEntity){
        alumnoService.guardar(alumnoEntity);
        return ResponseEntity.ok(alumnoEntity);
    }

    @GetMapping("/{rut}")
    public ResponseEntity<List<AlumnoEntity>> findAlumnoByRut(@PathVariable("rut") String rut){
        List <AlumnoEntity> alumno = alumnoService.findByRut(rut);
        return ResponseEntity.ok(alumno);
    }
}
