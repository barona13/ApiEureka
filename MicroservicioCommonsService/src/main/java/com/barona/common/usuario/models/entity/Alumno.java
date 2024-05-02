package com.barona.common.usuario.models.entity;

import jakarta.persistence.*;


import java.util.Date;


@Entity
@Table
public class Alumno {
	
	private String nombre;
    private String apellido;
    private String email;
    
    @Column(name = "creat_at")
    @Temporal(TemporalType.TIMESTAMP)
    private Date createAt;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;
    public Long getId() {
		return Id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Alumno)) {
			return false;
		}
		Alumno a =(Alumno)obj;
		
		return this.Id !=null && this.Id.equals(obj);
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

    @PrePersist
    private  void prePersiste(){
        this.createAt = new Date();
    }

}


