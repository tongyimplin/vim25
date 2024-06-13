package com.vmware.vim25;

import com.vmware.vim25.HostEvent;
import com.vmware.vim25.VcAgentUninstallFailedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VcAgentUninstallFailedEvent", propOrder = {"reason"})
public class VcAgentUninstallFailedEvent extends HostEvent {
  protected String reason;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
