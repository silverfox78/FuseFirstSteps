
package fuse.ejemplo.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Clase Java para Transfer complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="Transfer"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DatoOK" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="DatoProblema" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FechaUno" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="FechaDos" type="{http://www.w3.org/2001/XMLSchema}dateTime"/&gt;
 *         &lt;element name="NumeroUno" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *         &lt;element name="NumeroDos" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "Transfer", propOrder = {
    "datoOK",
    "datoProblema",
    "fechaUno",
    "fechaDos",
    "numeroUno",
    "numeroDos"
})
public class Transfer {

    @XmlElement(name = "DatoOK")
    protected String datoOK;
    @XmlElement(name = "DatoProblema")
    protected String datoProblema;
    @XmlElement(name = "FechaUno", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaUno;
    @XmlElement(name = "FechaDos", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaDos;
    @XmlElement(name = "NumeroUno")
    protected double numeroUno;
    @XmlElement(name = "NumeroDos")
    protected double numeroDos;

    /**
     * Obtiene el valor de la propiedad datoOK.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoOK() {
        return datoOK;
    }

    /**
     * Define el valor de la propiedad datoOK.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoOK(String value) {
        this.datoOK = value;
    }

    /**
     * Obtiene el valor de la propiedad datoProblema.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDatoProblema() {
        return datoProblema;
    }

    /**
     * Define el valor de la propiedad datoProblema.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDatoProblema(String value) {
        this.datoProblema = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaUno.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaUno() {
        return fechaUno;
    }

    /**
     * Define el valor de la propiedad fechaUno.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaUno(XMLGregorianCalendar value) {
        this.fechaUno = value;
    }

    /**
     * Obtiene el valor de la propiedad fechaDos.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaDos() {
        return fechaDos;
    }

    /**
     * Define el valor de la propiedad fechaDos.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaDos(XMLGregorianCalendar value) {
        this.fechaDos = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroUno.
     * 
     */
    public double getNumeroUno() {
        return numeroUno;
    }

    /**
     * Define el valor de la propiedad numeroUno.
     * 
     */
    public void setNumeroUno(double value) {
        this.numeroUno = value;
    }

    /**
     * Obtiene el valor de la propiedad numeroDos.
     * 
     */
    public double getNumeroDos() {
        return numeroDos;
    }

    /**
     * Define el valor de la propiedad numeroDos.
     * 
     */
    public void setNumeroDos(double value) {
        this.numeroDos = value;
    }

}
