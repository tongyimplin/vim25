package com.vmware.vim25;

import com.vmware.vim25.DuplicateIpDetectedEvent;
import com.vmware.vim25.HostEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DuplicateIpDetectedEvent", propOrder = {"duplicateIP", "macAddress"})
public class DuplicateIpDetectedEvent extends HostEvent {
  @XmlElement(required = true)
  protected String duplicateIP;
  
  @XmlElement(required = true)
  protected String macAddress;
  
  public String getDuplicateIP() {
    return this.duplicateIP;
  }
  
  public void setDuplicateIP(String paramString) {
    this.duplicateIP = paramString;
  }
  
  public String getMacAddress() {
    return this.macAddress;
  }
  
  public void setMacAddress(String paramString) {
    this.macAddress = paramString;
  }
}
