
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
 *         &lt;element name="Metodo06Result" type="{http://Ponyo.cl/}ArrayOfTransfer" minOccurs="0"/&gt;
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
    "metodo06Result"
})
@XmlRootElement(name = "Metodo06Response")
public class Metodo06Response {

    @XmlElement(name = "Metodo06Result")
    protected ArrayOfTransfer metodo06Result;

    /**
     * Obtiene el valor de la propiedad metodo06Result.
     * 
     * @return
     *     possible object is
     *     {@link ArrayOfTransfer }
     *     
     */
    public ArrayOfTransfer getMetodo06Result() {
        return metodo06Result;
    }

    /**
     * Define el valor de la propiedad metodo06Result.
     * 
     * @param value
     *     allowed object is
     *     {@link ArrayOfTransfer }
     *     
     */
    public void setMetodo06Result(ArrayOfTransfer value) {
        this.metodo06Result = value;
    }

}
