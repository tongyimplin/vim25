package com.vmware.vim25;

import com.vmware.vim25.OvfMissingElement;
import com.vmware.vim25.OvfMissingElementNormalBoundary;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OvfMissingElementNormalBoundary", propOrder = {"boundary"})
public class OvfMissingElementNormalBoundary extends OvfMissingElement {
  @XmlElement(required = true)
  protected String boundary;
  
  public String getBoundary() {
    return this.boundary;
  }
  
  public void setBoundary(String paramString) {
    this.boundary = paramString;
  }
}
