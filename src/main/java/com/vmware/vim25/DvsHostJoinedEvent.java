package com.vmware.vim25;

import com.vmware.vim25.DvsEvent;
import com.vmware.vim25.DvsHostJoinedEvent;
import com.vmware.vim25.HostEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsHostJoinedEvent", propOrder = {"hostJoined"})
public class DvsHostJoinedEvent extends DvsEvent {
  @XmlElement(required = true)
  protected HostEventArgument hostJoined;
  
  public HostEventArgument getHostJoined() {
    return this.hostJoined;
  }
  
  public void setHostJoined(HostEventArgument paramHostEventArgument) {
    this.hostJoined = paramHostEventArgument;
  }
}
