package com.vmware.vim25;

import com.vmware.vim25.OvfUnsupportedAttribute;
import com.vmware.vim25.OvfUnsupportedAttributeValue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnsupportedAttributeValue", propOrder = {"value"})
public class OvfUnsupportedAttributeValue extends OvfUnsupportedAttribute {
  @XmlElement(required = true)
  protected String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
