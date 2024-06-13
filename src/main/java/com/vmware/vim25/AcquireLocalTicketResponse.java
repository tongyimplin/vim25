package com.vmware.vim25;

import com.vmware.vim25.AcquireLocalTicketResponse;
import com.vmware.vim25.SessionManagerLocalTicket;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "AcquireLocalTicketResponse")
public class AcquireLocalTicketResponse {
  @XmlElement(required = true)
  protected SessionManagerLocalTicket returnval;
  
  public SessionManagerLocalTicket getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(SessionManagerLocalTicket paramSessionManagerLocalTicket) {
    this.returnval = paramSessionManagerLocalTicket;
  }
}
