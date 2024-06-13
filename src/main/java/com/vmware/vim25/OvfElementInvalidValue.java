package com.vmware.vim25;

import com.vmware.vim25.OvfElement;
import com.vmware.vim25.OvfElementInvalidValue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfElementInvalidValue", propOrder = {"value"})
public class OvfElementInvalidValue extends OvfElement {
  @XmlElement(required = true)
  protected String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
