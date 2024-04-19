package com.co.barona.usuarios.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.Date;


@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Alumno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    private String nombre;
    private String apellido;
    private String email;

    @Column(name = "creat_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @PrePersist
    private  void prePersiste(){
        this.createAt = new Date();
    }

}


