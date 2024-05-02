package com.barona.curso.repository;

import org.springframework.data.repository.CrudRepository;

import com.barona.common.usuario.models.entity.Curso;



public interface CursoRepository extends CrudRepository<Curso, Long>{

}
