package com.vmware.vim25;

import com.vmware.vim25.OvfConstraint;
import com.vmware.vim25.OvfHostResourceConstraint;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfHostResourceConstraint", propOrder = {"value"})
public class OvfHostResourceConstraint extends OvfConstraint {
  @XmlElement(required = true)
  protected String value;
  
  public String getValue() {
    return this.value;
  }
  
  public void setValue(String paramString) {
    this.value = paramString;
  }
}
