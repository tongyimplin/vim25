package com.vmware.vim25;

import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.MigrationEvent;
import com.vmware.vim25.MigrationHostWarningEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationHostWarningEvent", propOrder = {"dstHost"})
public class MigrationHostWarningEvent extends MigrationEvent {
  @XmlElement(required = true)
  protected HostEventArgument dstHost;
  
  public HostEventArgument getDstHost() {
    return this.dstHost;
  }
  
  public void setDstHost(HostEventArgument paramHostEventArgument) {
    this.dstHost = paramHostEventArgument;
  }
}
