package com.vmware.vim25;

import com.vmware.vim25.HostEvent;
import com.vmware.vim25.HostIpInconsistentEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIpInconsistentEvent", propOrder = {"ipAddress", "ipAddress2"})
public class HostIpInconsistentEvent extends HostEvent {
  @XmlElement(required = true)
  protected String ipAddress;
  
  @XmlElement(required = true)
  protected String ipAddress2;
  
  public String getIpAddress() {
    return this.ipAddress;
  }
  
  public void setIpAddress(String paramString) {
    this.ipAddress = paramString;
  }
  
  public String getIpAddress2() {
    return this.ipAddress2;
  }
  
  public void setIpAddress2(String paramString) {
    this.ipAddress2 = paramString;
  }
}
