package com.vmware.vim25;

import com.vmware.vim25.OvfAttribute;
import com.vmware.vim25.OvfInvalidPackage;
import com.vmware.vim25.OvfInvalidValue;
import com.vmware.vim25.OvfMissingAttribute;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfAttribute", propOrder = {"elementName", "attributeName"})
@XmlSeeAlso({OvfMissingAttribute.class, OvfInvalidValue.class})
public class OvfAttribute extends OvfInvalidPackage {
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
