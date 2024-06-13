package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmFailedToSuspendEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFailedToSuspendEvent", propOrder = {"reason"})
public class VmFailedToSuspendEvent extends VmEvent {
  @XmlElement(required = true)
  protected LocalizedMethodFault reason;
  
  public LocalizedMethodFault getReason() {
    return this.reason;
  }
  
  public void setReason(LocalizedMethodFault paramLocalizedMethodFault) {
    this.reason = paramLocalizedMethodFault;
  }
}
