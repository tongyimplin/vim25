package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsHostBackInSyncEvent;
import com.vmware.vim25.HostEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHostBackInSyncEvent", propOrder = {"hostBackInSync"})
public class DvsHostBackInSyncEvent extends DvsEvent {
  @XmlElement(required = true)
  protected HostEventArgument hostBackInSync;
  
  public HostEventArgument getHostBackInSync() {
    return this.hostBackInSync;
  }
  
  public void setHostBackInSync(HostEventArgument paramHostEventArgument) {
    this.hostBackInSync = paramHostEventArgument;
  }
}
