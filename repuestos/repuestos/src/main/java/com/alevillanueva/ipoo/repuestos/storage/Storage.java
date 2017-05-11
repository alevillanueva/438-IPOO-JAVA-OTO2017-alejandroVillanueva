package com.alevillanueva.ipoo.repuestos.storage;

import com.alevillanueva.ipoo.repuestos.datos.cliente.Cliente;

// declaracion de interface (public interface)
public interface Storage {

	
	//metodos
	Cliente obtCliente(String tipoDoc, String norDoc, String password);
	
}
