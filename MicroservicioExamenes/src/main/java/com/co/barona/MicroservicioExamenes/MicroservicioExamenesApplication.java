package com.co.barona.MicroservicioExamenes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@ComponentScan({ "com.barona.common.usuario.models.entity" })
@EnableDiscoveryClient
@EnableJpaRepositories({ "com.barona.common.usuario.models.entity" })
@EntityScan({ "com.barona.common.usuario.models.entity" }) 
@SpringBootApplication
public class MicroservicioExamenesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroservicioExamenesApplication.class, args);
	}

}
