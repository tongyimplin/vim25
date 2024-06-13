package com.vmware.vim25;

import com.vmware.vim25.ClusterEvent;
import com.vmware.vim25.DasHostFailedEvent;
import com.vmware.vim25.HostEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DasHostFailedEvent", propOrder = {"failedHost"})
public class DasHostFailedEvent extends ClusterEvent {
  @XmlElement(required = true)
  protected HostEventArgument failedHost;
  
  public HostEventArgument getFailedHost() {
    return this.failedHost;
  }
  
  public void setFailedHost(HostEventArgument paramHostEventArgument) {
    this.failedHost = paramHostEventArgument;
  }
}
