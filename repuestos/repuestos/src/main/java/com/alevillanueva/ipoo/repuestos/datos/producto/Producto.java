package com.alevillanueva.ipoo.repuestos.datos.producto;

public class Producto {

//atributos
	private Long id;
	private String nombre;
	private String descripción; 
	private Byte imagen;
	private Double precio;

	
	
//metodos
	public Producto(){
	}
	
	public Producto(Long id, String nombre, String descripción, Byte imagen, Double precio) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.descripción = descripción;
		this.imagen = imagen;
		this.precio = precio;
	}



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getDescripción() {
		return descripción;
	}



	public void setDescripción(String descripción) {
		this.descripción = descripción;
	}



	public Byte getImagen() {
		return imagen;
	}



	public void setImagen(Byte imagen) {
		this.imagen = imagen;
	}



	public Double getPrecio() {
		return precio;
	}



	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	
	
	
}

