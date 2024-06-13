package com.vmware.vim25;

import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.VmPoweredOffEvent;
import com.vmware.vim25.VmShutdownOnIsolationEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmShutdownOnIsolationEvent", propOrder = {"isolatedHost", "shutdownResult"})
public class VmShutdownOnIsolationEvent extends VmPoweredOffEvent {
  @XmlElement(required = true)
  protected HostEventArgument isolatedHost;
  
  protected String shutdownResult;
  
  public HostEventArgument getIsolatedHost() {
    return this.isolatedHost;
  }
  
  public void setIsolatedHost(HostEventArgument paramHostEventArgument) {
    this.isolatedHost = paramHostEventArgument;
  }
  
  public String getShutdownResult() {
    return this.shutdownResult;
  }
  
  public void setShutdownResult(String paramString) {
    this.shutdownResult = paramString;
  }
}
