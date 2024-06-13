package com.vmware.vim25;

import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmNoNetworkAccessEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmNoNetworkAccessEvent", propOrder = {"destHost"})
public class VmNoNetworkAccessEvent extends VmEvent {
  @XmlElement(required = true)
  protected HostEventArgument destHost;
  
  public HostEventArgument getDestHost() {
    return this.destHost;
  }
  
  public void setDestHost(HostEventArgument paramHostEventArgument) {
    this.destHost = paramHostEventArgument;
  }
}
