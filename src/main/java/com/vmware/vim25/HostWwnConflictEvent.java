package com.vmware.vim25;

import com.vmware.vim25.HostEvent;
import com.vmware.vim25.HostEventArgument;
import com.vmware.vim25.HostWwnConflictEvent;
import com.vmware.vim25.VmEventArgument;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostWwnConflictEvent", propOrder = {"conflictedVms", "conflictedHosts", "wwn"})
public class HostWwnConflictEvent extends HostEvent {
  protected List<VmEventArgument> conflictedVms;
  
  protected List<HostEventArgument> conflictedHosts;
  
  protected long wwn;
  
  public List<VmEventArgument> getConflictedVms() {
    if (this.conflictedVms == null)
      this.conflictedVms = new ArrayList<>(); 
    return this.conflictedVms;
  }
  
  public List<HostEventArgument> getConflictedHosts() {
    if (this.conflictedHosts == null)
      this.conflictedHosts = new ArrayList<>(); 
    return this.conflictedHosts;
  }
  
  public long getWwn() {
    return this.wwn;
  }
  
  public void setWwn(long paramLong) {
    this.wwn = paramLong;
  }
}
