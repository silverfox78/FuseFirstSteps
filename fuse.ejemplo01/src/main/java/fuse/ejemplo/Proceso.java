package fuse.ejemplo;

import org.apache.camel.Exchange;

public class Proceso {
	public String Metodo01(Exchange exchange) throws Exception{
		Object[] args = exchange.getIn().getBody(Object[].class);
		String nombre = (String) args[0];
		
        return "Hola " + nombre;
	}
}
