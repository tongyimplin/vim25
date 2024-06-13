package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmMacChangedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmMacChangedEvent", propOrder = {"adapter", "oldMac", "newMac"})
public class VmMacChangedEvent extends VmEvent {
  @XmlElement(required = true)
  protected String adapter;
  
  @XmlElement(required = true)
  protected String oldMac;
  
  @XmlElement(required = true)
  protected String newMac;
  
  public String getAdapter() {
    return this.adapter;
  }
  
  public void setAdapter(String paramString) {
    this.adapter = paramString;
  }
  
  public String getOldMac() {
    return this.oldMac;
  }
  
  public void setOldMac(String paramString) {
    this.oldMac = paramString;
  }
  
  public String getNewMac() {
    return this.newMac;
  }
  
  public void setNewMac(String paramString) {
    this.newMac = paramString;
  }
}
