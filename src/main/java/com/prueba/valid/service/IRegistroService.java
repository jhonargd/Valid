package com.prueba.valid.service;


import java.util.List;

import com.prueba.valid.model.Registro;

public interface IRegistroService {
	public List<Registro> listarRegistros();
	public Registro RegistroById(int id);
	public int addRegistro(Registro registro);
	public int editRegistro(int id);
}
