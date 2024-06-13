package com.vmware.vim25;

import com.vmware.vim25.NotEnoughResourcesToStartVmEvent;
import com.vmware.vim25.VmEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotEnoughResourcesToStartVmEvent", propOrder = {"reason"})
public class NotEnoughResourcesToStartVmEvent extends VmEvent {
  protected String reason;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
