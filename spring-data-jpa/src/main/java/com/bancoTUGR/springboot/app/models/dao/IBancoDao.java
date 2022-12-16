package com.bancoTUGR.springboot.app.models.dao;

import java.util.List;

import com.bancoTUGR.springboot.app.models.entity.Banco;

//Por estandar anteponemos la letra I para indicar que es una interfece
//es importante crear una clase de Implementacion, en donde declaremos los metodos de esta interface
public interface IBancoDao {


	
	public List<Banco> findAll();

	public void save(Banco banco);
	
	public Banco findOne(Long id);
	
	public void delete(Long id);

}
