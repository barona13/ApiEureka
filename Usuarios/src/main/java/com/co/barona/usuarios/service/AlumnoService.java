package com.co.barona.usuarios.service;



import com.barona.common.usuario.models.entity.Alumno;

import co.com.barona.microservicecommuns.MicroservicioCommuns.service.CommonService;



public interface AlumnoService extends CommonService<Alumno>{

    public Alumno save(Alumno alumno);

    public void  deleteById (Long id);
}
