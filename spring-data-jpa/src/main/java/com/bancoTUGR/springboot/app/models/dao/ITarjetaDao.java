package com.bancoTUGR.springboot.app.models.dao;

import java.util.List;

import com.bancoTUGR.springboot.app.models.entity.Tarjeta;

//Por estandar anteponemos la letra I para indicar que es una interfece
//es importante crear una clase de Implementacion, en donde declaremos los metodos de esta interface
public interface ITarjetaDao {


	
	public List<Tarjeta> findAll();

	public void save(Tarjeta tarjeta);
	
	public Tarjeta findOne(Long id);
	
	public void delete(Long id);

}
