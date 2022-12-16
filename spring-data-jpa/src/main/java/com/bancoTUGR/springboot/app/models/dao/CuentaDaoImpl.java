package com.bancoTUGR.springboot.app.models.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.bancoTUGR.springboot.app.models.entity.Cuenta;

//Decoramos con esta anotacion de Spring para marcar la clase como componente de persistencia de datos.
@Repository
public class CuentaDaoImpl implements ICluentaDao{

	//Creamos el Entity Manager con al anotacion PersistenceContext para que este pueda ser inyectado, y asi poder hacer uso de una base de datos. en este ejemplo usamos H2 mas adelante se mostrara con MySQL
	@PersistenceContext
	private EntityManager em;

	@SuppressWarnings("unchecked")
	@Transactional(readOnly = true)//Con esta anotacion se marca este metodo como Transactional, con el el valor unico de lectura
	@Override
	public List<Cuenta> findAll() {
		return em.createQuery("from Cuenta").getResultList();
	}

	@Override
	@Transactional(readOnly = true)
	public Cuenta findOne(Long id) {
		return em.find(Cuenta.class, id);
		//gracias a el objeto em del tipo EntityManager hace que los objetos ingresados se agregen al contexo de persistencia 
	}

	@Override
	@Transactional
	public void save(Cuenta cuenta) {
		if (cuenta.getIdCuenta() != null && cuenta.getIdCuenta() > 0) {
			em.merge(cuenta);
		} else {
			em.persist(cuenta);
		}
	}

	@Override
	@Transactional
	public void delete(Long id) {
		em.remove(findOne(id));
	}

}
