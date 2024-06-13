package com.vmware.vim25;

import com.vmware.vim25.OvfDuplicatedElementBoundary;
import com.vmware.vim25.OvfElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfDuplicatedElementBoundary", propOrder = {"boundary"})
public class OvfDuplicatedElementBoundary extends OvfElement {
  @XmlElement(required = true)
  protected String boundary;
  
  public String getBoundary() {
    return this.boundary;
  }
  
  public void setBoundary(String paramString) {
    this.boundary = paramString;
  }
}
