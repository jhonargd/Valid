package com.prueba.valid.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.prueba.valid.model.Registro;
import com.prueba.valid.modelDao.IRegistro;

@Service
public class RegistroService implements IRegistroService {
	
	@Autowired
	private IRegistro registroDAO;

	@Override
	public List<Registro> listarRegistros() {
		return registroDAO.listarRegistros();
	}

	@Override
	public Registro RegistroById(int id) {
		return registroDAO.RegistroById(id);
	}

	@Override
	public int addRegistro(Registro registro) {
		return registroDAO.addRegistro(registro);
	}

	@Override
	public int editRegistro(int id) {
		return registroDAO.editRegistro(id);
	}

}
