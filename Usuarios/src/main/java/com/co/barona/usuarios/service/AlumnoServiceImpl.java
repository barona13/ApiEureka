package com.co.barona.usuarios.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.barona.common.usuario.models.entity.Alumno;
import com.co.barona.usuarios.repository.AlumnoRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;


@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	AlumnoRepository dao;

    @Override
    @Transactional(readOnly = true)
    public Iterable<Alumno> findAll(){
        return dao.findAll();
    }

    @Override
    @Transactional(readOnly = true)
    public Optional<Alumno>findById(Long id){
        return Optional.empty();
    }

    @Override
    @Transactional
    public Alumno save(Alumno alumno){

        return null;
    }

    @Override
    @Transactional
    public void deleteById(Long id){

        dao.deleteById(id);
    }

}
