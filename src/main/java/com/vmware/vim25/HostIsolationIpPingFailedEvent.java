package com.vmware.vim25;

import com.vmware.vim25.HostDasEvent;
import com.vmware.vim25.HostIsolationIpPingFailedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIsolationIpPingFailedEvent", propOrder = {"isolationIp"})
public class HostIsolationIpPingFailedEvent extends HostDasEvent {
  @XmlElement(required = true)
  protected String isolationIp;
  
  public String getIsolationIp() {
    return this.isolationIp;
  }
  
  public void setIsolationIp(String paramString) {
    this.isolationIp = paramString;
  }
}
