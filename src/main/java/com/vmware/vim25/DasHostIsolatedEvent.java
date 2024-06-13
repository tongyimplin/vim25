package com.vmware.vim25;

import com.vmware.vim25.ClusterEvent;
import com.vmware.vim25.DasHostIsolatedEvent;
import com.vmware.vim25.HostEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DasHostIsolatedEvent", propOrder = {"isolatedHost"})
public class DasHostIsolatedEvent extends ClusterEvent {
  @XmlElement(required = true)
  protected HostEventArgument isolatedHost;
  
  public HostEventArgument getIsolatedHost() {
    return this.isolatedHost;
  }
  
  public void setIsolatedHost(HostEventArgument paramHostEventArgument) {
    this.isolatedHost = paramHostEventArgument;
  }
}
