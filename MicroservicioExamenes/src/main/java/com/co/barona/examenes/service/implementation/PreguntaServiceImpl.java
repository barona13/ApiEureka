package com.co.barona.examenes.service.implementation;

import org.springframework.stereotype.Service;

import com.barona.common.usuario.models.entity.Pregunta;
import co.com.barona.microservicecommuns.MicroservicioCommuns.service.CommonService;
import co.com.barona.microservicecommuns.MicroservicioCommuns.service.CommonServiceImpl;
import com.co.barona.examenes.repository.PreguntaRepository;

@Service
public class PreguntaServiceImpl extends CommonServiceImpl<Pregunta, PreguntaRepository> implements CommonService<Pregunta> {
}
