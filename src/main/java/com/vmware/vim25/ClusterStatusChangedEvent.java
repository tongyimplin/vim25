package com.vmware.vim25;

import com.vmware.vim25.ClusterEvent;
import com.vmware.vim25.ClusterStatusChangedEvent;
import com.vmware.vim25.HostStatusChangedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterStatusChangedEvent", propOrder = {"oldStatus", "newStatus"})
@XmlSeeAlso({HostStatusChangedEvent.class})
public class ClusterStatusChangedEvent extends ClusterEvent {
  @XmlElement(required = true)
  protected String oldStatus;
  
  @XmlElement(required = true)
  protected String newStatus;
  
  public String getOldStatus() {
    return this.oldStatus;
  }
  
  public void setOldStatus(String paramString) {
    this.oldStatus = paramString;
  }
  
  public String getNewStatus() {
    return this.newStatus;
  }
  
  public void setNewStatus(String paramString) {
    this.newStatus = paramString;
  }
}
