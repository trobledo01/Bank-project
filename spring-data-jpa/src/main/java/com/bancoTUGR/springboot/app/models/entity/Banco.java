package com.bancoTUGR.springboot.app.models.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;

@Entity 
@Table(name = "bancos") 

public class Banco implements Serializable {
	
	
	private static final long serialVersionUID = 1L;
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "Id")
	private Long idBanco;
	
	@NotEmpty
	@Column(name = "Nombre Banco")
	private String nombreBanco;
	
	@NotEmpty
	@Column(name = "Ubicacion")
	private  String ubicacion;

	public Long getIdBanco() {
		return idBanco;
	}

	public void setIdBanco(Long idBanco) {
		this.idBanco = idBanco;
	}

	public  String getNombreBanco() {
		return nombreBanco;
	}

	public void setNombreBanco( String nombreBanco) {
		this.nombreBanco = nombreBanco;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion( String ubicacion) {
		this.ubicacion = ubicacion;
	}
	
	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	

	

}
