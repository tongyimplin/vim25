package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmFailedStartingSecondaryEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFailedStartingSecondaryEvent", propOrder = {"reason"})
public class VmFailedStartingSecondaryEvent extends VmEvent {
  protected String reason;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
