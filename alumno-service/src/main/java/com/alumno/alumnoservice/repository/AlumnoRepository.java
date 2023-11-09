package com.alumno.alumnoservice.repository;

import com.alumno.alumnoservice.entity.AlumnoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlumnoRepository extends JpaRepository<AlumnoEntity, String> {
    public List<AlumnoEntity> findByRut(String rut);
}
