package com.bancoTUGR.springboot.app.models.dao;

import java.util.List;

import com.bancoTUGR.springboot.app.models.entity.Empleado;

//Por estandar anteponemos la letra I para indicar que es una interfece
//es importante crear una clase de Implementacion, en donde declaremos los metodos de esta interface
public interface IEmpleadoDao {


	
	public List<Empleado> findAll();

	public void save(Empleado empleado);
	
	public Empleado findOne(Long id);
	
	public void delete(Long id);

}
