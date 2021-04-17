package com.prueba.valid.modelDao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.prueba.valid.model.Registro;

@Repository
public class RegistroDAO implements IRegistro{
	
	@Autowired
	private JdbcTemplate template;

	@Override
	public List<Registro> listarRegistros() {
		String query = "SELECT id, nombre, apellido, procesado FROM REGISTRO";
		List<Registro> registros = template.query(query, new BeanPropertyRowMapper<Registro>(Registro.class));	
		return registros;
	}

	@Override
	public Registro RegistroById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int addRegistro(Registro registro) {
		String query = "INSERT INTO REGISTRO(nombre, apellido, procesado) values('" 
				+ registro.getNombre() + "', '" + registro.getApellido() +"', 0)";
		int res = template.update(query);
		return res;
	}

	@Override
	public int editRegistro(int id) {
		String query = "UPDATE REGISTRO SET procesado = 1 WHERE id = " + id;
		int res = template.update(query);
		return res;
	}

}
