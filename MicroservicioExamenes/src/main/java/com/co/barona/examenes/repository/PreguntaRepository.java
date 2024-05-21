package com.co.barona.examenes.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.barona.common.usuario.models.entity.Pregunta;


@Repository
public interface PreguntaRepository extends CrudRepository<Pregunta, Long> {
}
