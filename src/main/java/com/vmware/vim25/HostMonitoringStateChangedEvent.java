package com.vmware.vim25;

import com.vmware.vim25.ClusterEvent;
import com.vmware.vim25.HostMonitoringStateChangedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostMonitoringStateChangedEvent", propOrder = {"state", "prevState"})
public class HostMonitoringStateChangedEvent extends ClusterEvent {
  @XmlElement(required = true)
  protected String state;
  
  protected String prevState;
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
  
  public String getPrevState() {
    return this.prevState;
  }
  
  public void setPrevState(String paramString) {
    this.prevState = paramString;
  }
}
