//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-27 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2011.02.09 at 02:27:32 PM PST 
//


package edu.caltech.vao.vospace.resource;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * 
 *         An unstructured data node, containing unspecified content.
 *         The service does not need to understand or interpret the content.
 *         This type of node can accept any format, and only provides one view returning the original data.
 *       
 * 
 * <p>Java class for UnstructuredDataNodeType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="UnstructuredDataNodeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.ivoa.net/xml/VOSpace/v2.0}DataNodeType">
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnstructuredDataNodeType")
public class UnstructuredDataNodeType
    extends DataNodeType
{


}
