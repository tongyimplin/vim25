package com.vmware.vim25;

import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.VmPowerOffOnIsolationEvent;
import com.vmware.vim25.VmPoweredOffEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmPowerOffOnIsolationEvent", propOrder = {"isolatedHost"})
public class VmPowerOffOnIsolationEvent extends VmPoweredOffEvent {
  @XmlElement(required = true)
  protected HostEventArgument isolatedHost;
  
  public HostEventArgument getIsolatedHost() {
    return this.isolatedHost;
  }
  
  public void setIsolatedHost(HostEventArgument paramHostEventArgument) {
    this.isolatedHost = paramHostEventArgument;
  }
}
