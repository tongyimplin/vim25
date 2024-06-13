package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsOutOfSyncHostArgument;
import com.vmware.vim25.OutOfSyncDvsHost;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OutOfSyncDvsHost", propOrder = {"hostOutOfSync"})
public class OutOfSyncDvsHost extends DvsEvent {
  @XmlElement(required = true)
  protected List<DvsOutOfSyncHostArgument> hostOutOfSync;
  
  public List<DvsOutOfSyncHostArgument> getHostOutOfSync() {
    if (this.hostOutOfSync == null)
      this.hostOutOfSync = new ArrayList<>(); 
    return this.hostOutOfSync;
  }
}
