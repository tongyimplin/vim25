package com.vmware.vim25;

import com.vmware.vim25.OvfUnsupportedAttribute;
import com.vmware.vim25.OvfUnsupportedAttributeValue;
import com.vmware.vim25.OvfUnsupportedPackage;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnsupportedAttribute", propOrder = {"elementName", "attributeName"})
@XmlSeeAlso({OvfUnsupportedAttributeValue.class})
public class OvfUnsupportedAttribute extends OvfUnsupportedPackage {
  @XmlElement(required = true)
  protected String elementName;
  
  @XmlElement(required = true)
  protected String attributeName;
  
  public String getElementName() {
    return this.elementName;
  }
  
  public void setElementName(String paramString) {
    this.elementName = paramString;
  }
  
  public String getAttributeName() {
    return this.attributeName;
  }
  
  public void setAttributeName(String paramString) {
    this.attributeName = paramString;
  }
}
