package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmMacAssignedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmMacAssignedEvent", propOrder = {"adapter", "mac"})
public class VmMacAssignedEvent extends VmEvent {
  @XmlElement(required = true)
  protected String adapter;
  
  @XmlElement(required = true)
  protected String mac;
  
  public String getAdapter() {
    return this.adapter;
  }
  
  public void setAdapter(String paramString) {
    this.adapter = paramString;
  }
  
  public String getMac() {
    return this.mac;
  }
  
  public void setMac(String paramString) {
    this.mac = paramString;
  }
}
