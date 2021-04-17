package com.prueba.valid.model;

public class Registro {

	private int id;
	private String nombre;
	private String apellido;
	private boolean procesado;
	
	
	public Registro() {
	
	}


	public Registro(int id, String nombre, String apellido, boolean procesado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.procesado = procesado;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public void setApellido(String apellido) {
		this.apellido = apellido;
	}


	public boolean isProcesado() {
		return procesado;
	}


	public void setProcesado(boolean procesado) {
		this.procesado = procesado;
	}
	
	
	
	
	
}
