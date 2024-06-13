package com.vmware.vim25;

import com.vmware.vim25.NoAccessUserEvent;
import com.vmware.vim25.SessionEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NoAccessUserEvent", propOrder = {"ipAddress"})
public class NoAccessUserEvent extends SessionEvent {
  @XmlElement(required = true)
  protected String ipAddress;
  
  public String getIpAddress() {
    return this.ipAddress;
  }
  
  public void setIpAddress(String paramString) {
    this.ipAddress = paramString;
  }
}
