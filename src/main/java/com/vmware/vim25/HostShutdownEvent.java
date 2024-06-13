package com.vmware.vim25;

import com.vmware.vim25.HostEvent;
import com.vmware.vim25.HostShutdownEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostShutdownEvent", propOrder = {"reason"})
public class HostShutdownEvent extends HostEvent {
  @XmlElement(required = true)
  protected String reason;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
