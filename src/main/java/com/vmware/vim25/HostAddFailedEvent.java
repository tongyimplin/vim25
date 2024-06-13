package com.vmware.vim25;

import com.vmware.vim25.HostAddFailedEvent;
import com.vmware.vim25.HostEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostAddFailedEvent", propOrder = {"hostname"})
public class HostAddFailedEvent extends HostEvent {
  @XmlElement(required = true)
  protected String hostname;
  
  public String getHostname() {
    return this.hostname;
  }
  
  public void setHostname(String paramString) {
    this.hostname = paramString;
  }
}
