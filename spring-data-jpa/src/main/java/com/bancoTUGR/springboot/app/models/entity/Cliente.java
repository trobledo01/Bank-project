package com.bancoTUGR.springboot.app.models.entity;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;

@Entity //IMPORTANTE estas dos anotaciones/decoradores son pilares
@Table(name = "clientes") //es importante seguir el estandar de java para la sintaxis en lenguaje SQL las tablas en plural decibo a que es un conjunto de registros
//y las clases de java son en singular debido a que manejamos un objeto a la vez
public class Cliente implements Serializable {
	//implementamos Serializable debido a que el objeto sera transferido a una unidad de almacenamiento, en este caso a una sesion HTTP
	
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "Id")
	private Long idCliente;
	
	@NotEmpty
	@Column(name = "nombre")
	private String nombre;
	
	@NotEmpty
	@Column(name = "apellido")
	private  String apellido;
	
	@Email
	@NotEmpty
	@Column(name = "email")
	private  String email;
	
	@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cuenta_id", referencedColumnName = "id")
    private Cuenta cuenta;
	
	@NotEmpty
	private  String numTel;
	
	@DateTimeFormat(pattern="yyyy-MM-dd")
	@Temporal(TemporalType.DATE)//con .DATE especificamos solo la fecha, sin horas.
	@Column(name = "create_at")
	@NotNull
	private  Date createAt;

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public  String getNombre() {
		return nombre;
	}

	public void setNombre( String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public  String getEmail() {
		return email;
	}

	public void setEmail( String email) {
		this.email = email;
	}

	

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel( String numTel) {
		this.numTel = numTel;
	}

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt( Date createAt) {
		this.createAt = createAt;
	}

	public Cuenta getCuenta() {
		return cuenta;
	}

	public void setCuenta(Cuenta cuenta) {
		this.cuenta = cuenta;
	}
	
	

	


	//private static final long serialVersionUID = 1L;

}
