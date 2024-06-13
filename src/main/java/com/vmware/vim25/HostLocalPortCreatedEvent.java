package com.vmware.vim25;

import com.vmware.vim25.DVSHostLocalPortInfo;
import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.HostLocalPortCreatedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostLocalPortCreatedEvent", propOrder = {"hostLocalPort"})
public class HostLocalPortCreatedEvent extends DvsEvent {
  @XmlElement(required = true)
  protected DVSHostLocalPortInfo hostLocalPort;
  
  public DVSHostLocalPortInfo getHostLocalPort() {
    return this.hostLocalPort;
  }
  
  public void setHostLocalPort(DVSHostLocalPortInfo paramDVSHostLocalPortInfo) {
    this.hostLocalPort = paramDVSHostLocalPortInfo;
  }
}
