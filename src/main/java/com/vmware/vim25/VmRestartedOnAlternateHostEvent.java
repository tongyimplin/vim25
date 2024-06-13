package com.vmware.vim25;

import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.VmPoweredOnEvent;
import com.vmware.vim25.VmRestartedOnAlternateHostEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmRestartedOnAlternateHostEvent", propOrder = {"sourceHost"})
public class VmRestartedOnAlternateHostEvent extends VmPoweredOnEvent {
  @XmlElement(required = true)
  protected HostEventArgument sourceHost;
  
  public HostEventArgument getSourceHost() {
    return this.sourceHost;
  }
  
  public void setSourceHost(HostEventArgument paramHostEventArgument) {
    this.sourceHost = paramHostEventArgument;
  }
}
