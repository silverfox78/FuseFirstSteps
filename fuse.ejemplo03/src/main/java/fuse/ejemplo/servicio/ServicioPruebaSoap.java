package fuse.ejemplo.servicio;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 3.0.15
 * 2017-11-08T16:34:59.418-03:00
 * Generated source version: 3.0.15
 * 
 */
@WebService(targetNamespace = "http://Ponyo.cl/", name = "ServicioPruebaSoap")
@XmlSeeAlso({ObjectFactory.class})
public interface ServicioPruebaSoap {

    /**
     * Metodo 01 - Retorno Transfer
     */
    @WebMethod(operationName = "Metodo01", action = "http://Ponyo.cl/Metodo01")
    @RequestWrapper(localName = "Metodo01", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.Metodo01")
    @ResponseWrapper(localName = "Metodo01Response", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.Metodo01Response")
    @WebResult(name = "Metodo01Result", targetNamespace = "http://Ponyo.cl/")
    public fuse.ejemplo.servicio.Transfer metodo01();

    /**
     * Metodo - Decimal pequeño
     */
    @WebMethod(operationName = "Metodo", action = "http://Ponyo.cl/Metodo")
    @RequestWrapper(localName = "Metodo", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.Metodo")
    @ResponseWrapper(localName = "MetodoResponse", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.MetodoResponse")
    @WebResult(name = "double", targetNamespace = "http://Ponyo.cl/")
    public java.lang.String metodo();

    /**
     * Metodo 06 - Retorno Lista Transfer
     */
    @WebMethod(operationName = "Metodo06", action = "http://Ponyo.cl/Metodo06")
    @RequestWrapper(localName = "Metodo06", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.Metodo06")
    @ResponseWrapper(localName = "Metodo06Response", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.Metodo06Response")
    @WebResult(name = "Metodo06Result", targetNamespace = "http://Ponyo.cl/")
    public fuse.ejemplo.servicio.ArrayOfTransfer metodo06(
        @WebParam(name = "param1", targetNamespace = "http://Ponyo.cl/")
        fuse.ejemplo.servicio.Transfer param1
    );

    /**
     * Metodo 04 - Retorno Lista Transfer
     */
    @WebMethod(operationName = "Metodo04", action = "http://Ponyo.cl/Metodo04")
    @RequestWrapper(localName = "Metodo04", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.Metodo04")
    @ResponseWrapper(localName = "Metodo04Response", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.Metodo04Response")
    @WebResult(name = "Metodo04Result", targetNamespace = "http://Ponyo.cl/")
    public fuse.ejemplo.servicio.ArrayOfTransfer metodo04(
        @WebParam(name = "param1", targetNamespace = "http://Ponyo.cl/")
        java.lang.String param1,
        @WebParam(name = "param2", targetNamespace = "http://Ponyo.cl/")
        javax.xml.datatype.XMLGregorianCalendar param2,
        @WebParam(name = "param3", targetNamespace = "http://Ponyo.cl/")
        double param3
    );

    /**
     * Metodo 05 - Retorno Transfer
     */
    @WebMethod(operationName = "Metodo05", action = "http://Ponyo.cl/Metodo05")
    @RequestWrapper(localName = "Metodo05", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.Metodo05")
    @ResponseWrapper(localName = "Metodo05Response", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.Metodo05Response")
    @WebResult(name = "Metodo05Result", targetNamespace = "http://Ponyo.cl/")
    public fuse.ejemplo.servicio.Transfer metodo05(
        @WebParam(name = "param1", targetNamespace = "http://Ponyo.cl/")
        fuse.ejemplo.servicio.Transfer param1
    );

    /**
     * Metodo 02 - Retorno Lista Transfer
     */
    @WebMethod(operationName = "Metodo02", action = "http://Ponyo.cl/Metodo02")
    @RequestWrapper(localName = "Metodo02", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.Metodo02")
    @ResponseWrapper(localName = "Metodo02Response", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.Metodo02Response")
    @WebResult(name = "Metodo02Result", targetNamespace = "http://Ponyo.cl/")
    public fuse.ejemplo.servicio.ArrayOfTransfer metodo02();

    /**
     * Metodo 03 - Retorno Transfer
     */
    @WebMethod(operationName = "Metodo03", action = "http://Ponyo.cl/Metodo03")
    @RequestWrapper(localName = "Metodo03", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.Metodo03")
    @ResponseWrapper(localName = "Metodo03Response", targetNamespace = "http://Ponyo.cl/", className = "fuse.ejemplo.servicio.Metodo03Response")
    @WebResult(name = "Metodo03Result", targetNamespace = "http://Ponyo.cl/")
    public fuse.ejemplo.servicio.Transfer metodo03(
        @WebParam(name = "param1", targetNamespace = "http://Ponyo.cl/")
        java.lang.String param1,
        @WebParam(name = "param2", targetNamespace = "http://Ponyo.cl/")
        javax.xml.datatype.XMLGregorianCalendar param2,
        @WebParam(name = "param3", targetNamespace = "http://Ponyo.cl/")
        double param3
    );
}
