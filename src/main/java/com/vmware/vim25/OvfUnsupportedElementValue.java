package com.vmware.vim25;

import com.vmware.vim25.OvfUnsupportedElement;
import com.vmware.vim25.OvfUnsupportedElementValue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfUnsupportedElementValue", propOrder = {"value"})
public class OvfUnsupportedElementValue extends OvfUnsupportedElement {
  @XmlElement(required = true)
  protected String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
