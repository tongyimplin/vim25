package com.vmware.vim25;

import com.vmware.vim25.HostIncompatibleForFaultTolerance;
import com.vmware.vim25.VmFaultToleranceIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostIncompatibleForFaultTolerance", propOrder = {"hostName", "reason"})
public class HostIncompatibleForFaultTolerance extends VmFaultToleranceIssue {
  protected String hostName;
  
  protected String reason;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
