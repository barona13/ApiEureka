package com.co.barona.usuarios.repository;


import org.springframework.data.repository.CrudRepository;

import com.barona.common.usuario.models.entity.Alumno;

public interface AlumnoRepository extends CrudRepository<Alumno, Long> {
}
