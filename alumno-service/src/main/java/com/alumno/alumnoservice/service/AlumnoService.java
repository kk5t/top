package com.alumno.alumnoservice.service;

import com.alumno.alumnoservice.entity.AlumnoEntity;
import com.alumno.alumnoservice.repository.AlumnoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlumnoService {
    @Autowired
    AlumnoRepository alumnoRepository;

    public AlumnoEntity guardar(AlumnoEntity newAlumno){
        if (newAlumno != null){
            if (newAlumno.getTipo_pago().equals("Contado")){
                newAlumno.setArancel(750000);
                return alumnoRepository.save(newAlumno);
            }
            newAlumno.setArancel(0);
            return alumnoRepository.save(newAlumno);
        }
        return null;
    }

    public List<AlumnoEntity> getAll(){
        return alumnoRepository.findAll();
    }

    public List<AlumnoEntity> findByRut(String rut){return alumnoRepository.findByRut(rut);}
}
