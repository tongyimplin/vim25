package com.vmware.vim25;

import com.vmware.vim25.AcquireTicketResponse;
import com.vmware.vim25.VirtualMachineTicket;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "AcquireTicketResponse")
public class AcquireTicketResponse {
  @XmlElement(required = true)
  protected VirtualMachineTicket returnval;
  
  public VirtualMachineTicket getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VirtualMachineTicket paramVirtualMachineTicket) {
    this.returnval = paramVirtualMachineTicket;
  }
}
