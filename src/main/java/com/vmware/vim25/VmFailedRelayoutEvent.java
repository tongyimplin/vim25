package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmFailedRelayoutEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFailedRelayoutEvent", propOrder = {"reason"})
public class VmFailedRelayoutEvent extends VmEvent {
  @XmlElement(required = true)
  protected LocalizedMethodFault reason;
  
  public LocalizedMethodFault getReason() {
    return this.reason;
  }
  
  public void setReason(LocalizedMethodFault paramLocalizedMethodFault) {
    this.reason = paramLocalizedMethodFault;
  }
}
