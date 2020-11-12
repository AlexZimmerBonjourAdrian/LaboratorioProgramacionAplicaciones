
package servidor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para datosEdicion complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="datosEdicion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="curso" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="edicion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="instituto" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "datosEdicion", propOrder = {
    "curso",
    "edicion",
    "instituto"
})
public class DatosEdicion {

    protected String curso;
    protected String edicion;
    protected String instituto;

    /**
     * Obtiene el valor de la propiedad curso.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Define el valor de la propiedad curso.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurso(String value) {
        this.curso = value;
    }

    /**
     * Obtiene el valor de la propiedad edicion.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEdicion() {
        return edicion;
    }

    /**
     * Define el valor de la propiedad edicion.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEdicion(String value) {
        this.edicion = value;
    }

    /**
     * Obtiene el valor de la propiedad instituto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstituto() {
        return instituto;
    }

    /**
     * Define el valor de la propiedad instituto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstituto(String value) {
        this.instituto = value;
    }

}
