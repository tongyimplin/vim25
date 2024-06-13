package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsHostWentOutOfSyncEvent;
import com.vmware.vim25.DvsOutOfSyncHostArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHostWentOutOfSyncEvent", propOrder = {"hostOutOfSync"})
public class DvsHostWentOutOfSyncEvent extends DvsEvent {
  @XmlElement(required = true)
  protected DvsOutOfSyncHostArgument hostOutOfSync;
  
  public DvsOutOfSyncHostArgument getHostOutOfSync() {
    return this.hostOutOfSync;
  }
  
  public void setHostOutOfSync(DvsOutOfSyncHostArgument paramDvsOutOfSyncHostArgument) {
    this.hostOutOfSync = paramDvsOutOfSyncHostArgument;
  }
}
