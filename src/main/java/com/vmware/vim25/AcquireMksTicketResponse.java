package com.vmware.vim25;

import com.vmware.vim25.AcquireMksTicketResponse;
import com.vmware.vim25.VirtualMachineMksTicket;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "AcquireMksTicketResponse")
public class AcquireMksTicketResponse {
  @XmlElement(required = true)
  protected VirtualMachineMksTicket returnval;
  
  public VirtualMachineMksTicket getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(VirtualMachineMksTicket paramVirtualMachineMksTicket) {
    this.returnval = paramVirtualMachineMksTicket;
  }
}
