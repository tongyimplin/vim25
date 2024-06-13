package com.vmware.vim25;

import com.vmware.vim25.CannotEnableVmcpForCluster;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CannotEnableVmcpForCluster", propOrder = {"host", "hostName", "reason"})
public class CannotEnableVmcpForCluster extends VimFault {
  protected ManagedObjectReference host;
  
  protected String hostName;
  
  protected String reason;
  
  public ManagedObjectReference getHost() {
    return this.host;
  }
  
  public void setHost(ManagedObjectReference paramManagedObjectReference) {
    this.host = paramManagedObjectReference;
  }
  
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
