package com.vmware.vim25;

import com.vmware.vim25.HostCnxFailedAlreadyManagedEvent;
import com.vmware.vim25.HostEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostCnxFailedAlreadyManagedEvent", propOrder = {"serverName"})
public class HostCnxFailedAlreadyManagedEvent extends HostEvent {
  @XmlElement(required = true)
  protected String serverName;
  
  public String getServerName() {
    return this.serverName;
  }
  
  public void setServerName(String paramString) {
    this.serverName = paramString;
  }
}
