package com.vmware.vim25;

import com.vmware.vim25.VmAcquiredTicketEvent;
import com.vmware.vim25.VmEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmAcquiredTicketEvent", propOrder = {"ticketType"})
public class VmAcquiredTicketEvent extends VmEvent {
  @XmlElement(required = true)
  protected String ticketType;
  
  public String getTicketType() {
    return this.ticketType;
  }
  
  public void setTicketType(String paramString) {
    this.ticketType = paramString;
  }
}
