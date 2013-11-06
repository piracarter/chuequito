package com.example.example10.model;

public class Room {
	private String Titulo;
	private String Descripcion;
	private double Precio;
	private int vista;
	public Room(String Titulo, String Descripcion, double Precio, int vista){
		this.Titulo = Titulo;
		this.Descripcion = Descripcion;
		this.Precio = Precio;
		this.vista = vista;
	}
	public String getTitulo() {
		return Titulo;
	}
	public void setTitulo(String titulo) {
		Titulo = titulo;
	}
	public String getDescripcion() {
		return Descripcion;
	}
	public void setDescripcion(String descripcion) {
		Descripcion = descripcion;
	}
	public double getPrecio() {
		return Precio;
	}
	public void setPrecio(double precio) {
		Precio = precio;
	}
	public int getVista() {
		return vista;
	}
	public void setVista(int vista) {
		this.vista = vista;
	}
}
