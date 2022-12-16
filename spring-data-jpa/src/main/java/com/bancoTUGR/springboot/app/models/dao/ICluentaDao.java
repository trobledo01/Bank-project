package com.bancoTUGR.springboot.app.models.dao;

import java.util.List;

import com.bancoTUGR.springboot.app.models.entity.Cuenta;

//Por estandar anteponemos la letra I para indicar que es una interfece
//es importante crear una clase de Implementacion, en donde declaremos los metodos de esta interface
public interface ICluentaDao {


	
	public List<Cuenta> findAll();

	public void save(Cuenta cuenta);
	
	public Cuenta findOne(Long id);
	
	public void delete(Long id);

}
