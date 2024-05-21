package com.co.barona.examenes.service.implementation;


import org.springframework.stereotype.Service;

import com.barona.common.usuario.models.entity.Examen;
import co.com.barona.microservicecommuns.MicroservicioCommuns.service.CommonService;
import co.com.barona.microservicecommuns.MicroservicioCommuns.service.CommonServiceImpl;
import com.co.barona.examenes.repository.ExamenRepository;


@Service
public class ExamenServiceImpl extends CommonServiceImpl<Examen, ExamenRepository> implements CommonService<Examen> {
}