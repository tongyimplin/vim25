package com.vmware.vim25;

import com.vmware.vim25.AcquireCimServicesTicketResponse;
import com.vmware.vim25.HostServiceTicket;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "AcquireCimServicesTicketResponse")
public class AcquireCimServicesTicketResponse {
  @XmlElement(required = true)
  protected HostServiceTicket returnval;
  
  public HostServiceTicket getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(HostServiceTicket paramHostServiceTicket) {
    this.returnval = paramHostServiceTicket;
  }
}
