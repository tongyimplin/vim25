package com.vmware.vim25;

import com.vmware.vim25.AcquireGenericServiceTicketResponse;
import com.vmware.vim25.SessionManagerGenericServiceTicket;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "AcquireGenericServiceTicketResponse")
public class AcquireGenericServiceTicketResponse {
  @XmlElement(required = true)
  protected SessionManagerGenericServiceTicket returnval;
  
  public SessionManagerGenericServiceTicket getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(SessionManagerGenericServiceTicket paramSessionManagerGenericServiceTicket) {
    this.returnval = paramSessionManagerGenericServiceTicket;
  }
}
