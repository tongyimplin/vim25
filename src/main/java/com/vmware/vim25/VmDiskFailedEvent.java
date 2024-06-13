package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.VmDiskFailedEvent;
import com.vmware.vim25.VmEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmDiskFailedEvent", propOrder = {"disk", "reason"})
public class VmDiskFailedEvent extends VmEvent {
  @XmlElement(required = true)
  protected String disk;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault reason;
  
  public String getDisk() {
    return this.disk;
  }
  
  public void setDisk(String paramString) {
    this.disk = paramString;
  }
  
  public LocalizedMethodFault getReason() {
    return this.reason;
  }
  
  public void setReason(LocalizedMethodFault paramLocalizedMethodFault) {
    this.reason = paramLocalizedMethodFault;
  }
}
