
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
 *         &lt;element name="Metodo05Result" type="{http://Ponyo.cl/}Transfer" minOccurs="0"/&gt;
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
    "metodo05Result"
})
@XmlRootElement(name = "Metodo05Response")
public class Metodo05Response {

    @XmlElement(name = "Metodo05Result")
    protected Transfer metodo05Result;

    /**
     * Obtiene el valor de la propiedad metodo05Result.
     * 
     * @return
     *     possible object is
     *     {@link Transfer }
     *     
     */
    public Transfer getMetodo05Result() {
        return metodo05Result;
    }

    /**
     * Define el valor de la propiedad metodo05Result.
     * 
     * @param value
     *     allowed object is
     *     {@link Transfer }
     *     
     */
    public void setMetodo05Result(Transfer value) {
        this.metodo05Result = value;
    }

}
