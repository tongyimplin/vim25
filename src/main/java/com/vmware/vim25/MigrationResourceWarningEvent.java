package com.vmware.vim25;

import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.MigrationEvent;
import com.vmware.vim25.MigrationResourceWarningEvent;
import com.vmware.vim25.ResourcePoolEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationResourceWarningEvent", propOrder = {"dstPool", "dstHost"})
public class MigrationResourceWarningEvent extends MigrationEvent {
  @XmlElement(required = true)
  protected ResourcePoolEventArgument dstPool;
  
  @XmlElement(required = true)
  protected HostEventArgument dstHost;
  
  public ResourcePoolEventArgument getDstPool() {
    return this.dstPool;
  }
  
  public void setDstPool(ResourcePoolEventArgument paramResourcePoolEventArgument) {
    this.dstPool = paramResourcePoolEventArgument;
  }
  
  public HostEventArgument getDstHost() {
    return this.dstHost;
  }
  
  public void setDstHost(HostEventArgument paramHostEventArgument) {
    this.dstHost = paramHostEventArgument;
  }
}
