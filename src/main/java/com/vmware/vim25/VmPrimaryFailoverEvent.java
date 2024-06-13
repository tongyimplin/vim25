package com.vmware.vim25;

import com.vmware.vim25.VmEvent;
import com.vmware.vim25.VmPrimaryFailoverEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmPrimaryFailoverEvent", propOrder = {"reason"})
public class VmPrimaryFailoverEvent extends VmEvent {
  protected String reason;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
