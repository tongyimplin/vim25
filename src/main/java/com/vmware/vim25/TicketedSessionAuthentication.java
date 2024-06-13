package com.vmware.vim25;

import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.TicketedSessionAuthentication;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TicketedSessionAuthentication", propOrder = {"ticket"})
public class TicketedSessionAuthentication extends GuestAuthentication {
  @XmlElement(required = true)
  protected String ticket;
  
  public String getTicket() {
    return this.ticket;
  }
  
  public void setTicket(String paramString) {
    this.ticket = paramString;
  }
}
