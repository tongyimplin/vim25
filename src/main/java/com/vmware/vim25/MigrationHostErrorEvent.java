package com.vmware.vim25;

import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.MigrationEvent;
import com.vmware.vim25.MigrationHostErrorEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationHostErrorEvent", propOrder = {"dstHost"})
public class MigrationHostErrorEvent extends MigrationEvent {
  @XmlElement(required = true)
  protected HostEventArgument dstHost;
  
  public HostEventArgument getDstHost() {
    return this.dstHost;
  }
  
  public void setDstHost(HostEventArgument paramHostEventArgument) {
    this.dstHost = paramHostEventArgument;
  }
}
