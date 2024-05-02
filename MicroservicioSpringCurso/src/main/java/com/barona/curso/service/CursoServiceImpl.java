package com.barona.curso.service;

import org.springframework.stereotype.Service;

import com.barona.curso.models.entity.Curso;
import com.barona.curso.repository.CursoRepository;

import co.com.barona.microservicecommuns.MicroservicioCommuns.service.CommonService;
import co.com.barona.microservicecommuns.MicroservicioCommuns.service.CommonServiceImpl;

@Service
public class CursoServiceImpl extends CommonServiceImpl <Curso, CursoRepository> implements CommonService<Curso>{

}
