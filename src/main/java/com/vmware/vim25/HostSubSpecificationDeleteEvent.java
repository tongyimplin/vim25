package com.vmware.vim25;

import com.vmware.vim25.HostEvent;
import com.vmware.vim25.HostSubSpecificationDeleteEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSubSpecificationDeleteEvent", propOrder = {"subSpecName"})
public class HostSubSpecificationDeleteEvent extends HostEvent {
  @XmlElement(required = true)
  protected String subSpecName;
  
  public String getSubSpecName() {
    return this.subSpecName;
  }
  
  public void setSubSpecName(String paramString) {
    this.subSpecName = paramString;
  }
}
