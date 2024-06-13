package com.vmware.vim25;

import com.vmware.vim25.HostEvent;
import com.vmware.vim25.HostIpChangedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpChangedEvent", propOrder = {"oldIP", "newIP"})
public class HostIpChangedEvent extends HostEvent {
  @XmlElement(required = true)
  protected String oldIP;
  
  @XmlElement(required = true)
  protected String newIP;
  
  public String getOldIP() {
    return this.oldIP;
  }
  
  public void setOldIP(String paramString) {
    this.oldIP = paramString;
  }
  
  public String getNewIP() {
    return this.newIP;
  }
  
  public void setNewIP(String paramString) {
    this.newIP = paramString;
  }
}
