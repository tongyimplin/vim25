package com.vmware.vim25;

import com.vmware.vim25.OvfHostValueNotParsed;
import com.vmware.vim25.OvfSystemFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfHostValueNotParsed", propOrder = {"property", "value"})
public class OvfHostValueNotParsed extends OvfSystemFault {
  @XmlElement(required = true)
  protected String property;
  
  @XmlElement(required = true)
  protected String value;
  
  public String getProperty() {
    return this.property;
  }
  
  public void setProperty(String paramString) {
    this.property = paramString;
  }
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
