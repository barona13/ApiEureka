package com.barona.curso.repository;

import org.springframework.data.repository.CrudRepository;

import com.barona.curso.models.entity.Curso;

public interface CursoRepository extends CrudRepository<Curso, Long>{

}
