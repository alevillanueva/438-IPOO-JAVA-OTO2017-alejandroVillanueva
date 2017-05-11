package com.alevillanueva.ipoo.repuestos.storage;

import java.util.ArrayList;
import java.util.List;

import com.alevillanueva.ipoo.repuestos.datos.cliente.Cliente;

public class DummyStorage implements Storage{
	
	//lista de clientes falsos
	private List<Cliente> clientes;
	
	public DummyStorage(){
		//variable para simular un autonumerico de base de datos
		long id=0;
		
		//inicializar mi vector
		clientes=new ArrayList<>();
		
		Cliente c=new Cliente();
		c.setId(++id);
		c.setNombre("Alejandro Villanueva");
		c.setNroDoc("9999999");
		c.setTipoDoc("CI");
		
		clientes.add(c);
	}
	
	@Override
	public Cliente obtCliente(String tipoDoc, String norDoc, String password) {
		for(Cliente c: clientes){
			if(
					c.getTipoDoc().equals(tipoDoc) &&
					c.getNroDoc().equals(norDoc) &&
					c.getPassword().equals(password)
			){
				return c;
			}		
		}
		return null;

	}
	
	public static void main(String[] args){
	cliente c=s.obtCliente("CI", "9999999", "123");
	
	}

}
