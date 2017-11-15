
package fuse.ejemplo.servicio;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="Metodo03Result" type="{http://Ponyo.cl/}Transfer" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "metodo03Result"
})
@XmlRootElement(name = "Metodo03Response")
public class Metodo03Response {

    @XmlElement(name = "Metodo03Result")
    protected Transfer metodo03Result;

    /**
     * Obtiene el valor de la propiedad metodo03Result.
     * 
     * @return
     *     possible object is
     *     {@link Transfer }
     *     
     */
    public Transfer getMetodo03Result() {
        return metodo03Result;
    }

    /**
     * Define el valor de la propiedad metodo03Result.
     * 
     * @param value
     *     allowed object is
     *     {@link Transfer }
     *     
     */
    public void setMetodo03Result(Transfer value) {
        this.metodo03Result = value;
    }

}
