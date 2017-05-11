package com.alevillanueva.ipoo.repuestos.datos.cliente;

import java.util.Date;

public class Acceso {
//atributos
	private Date fechaHoraInicio;
	private Date fechaHoraFin;
	private String ip;
	private Cliente Cliente;
	

//Métodos
	
	//constructor
	public Acceso(){
	}

	public Acceso(Date fechaHoraInicio, Date fechaHoraFin, String ip,
			com.alevillanueva.ipoo.repuestos.datos.cliente.Cliente cliente) {
		super();
		this.fechaHoraInicio = fechaHoraInicio;
		this.fechaHoraFin = fechaHoraFin;
		this.ip = ip;
		Cliente = cliente;
	}


	public Date getFechaHoraInicio() {
		return fechaHoraInicio;
	}


	public void setFechaHoraInicio(Date fechaHoraInicio) {
		this.fechaHoraInicio = fechaHoraInicio;
	}


	public Date getFechaHoraFin() {
		return fechaHoraFin;
	}


	public void setFechaHoraFin(Date fechaHoraFin) {
		this.fechaHoraFin = fechaHoraFin;
	}


	public String getIp() {
		return ip;
	}


	public void setIp(String ip) {
		this.ip = ip;
	}


	public Cliente getCliente() {
		return Cliente;
	}


	public void setCliente(Cliente cliente) {
		Cliente = cliente;
	}
	
	


	
}//fin de la clase
