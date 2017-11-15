package fuse.ejemplo.negocio;

import org.apache.camel.Exchange;

import fuse.ejemplo.servicio.ServicioPrueba;

public class Proceso {

	public String Metodo(Exchange exchange) throws Exception{
        return "Hola " + new ServicioPrueba().getServicioPruebaSoap().metodo();
	}
}
