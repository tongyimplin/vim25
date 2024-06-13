package com.vmware.vim25;

import com.vmware.vim25.IncompatibleHostForVmReplication;
import com.vmware.vim25.ReplicationFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IncompatibleHostForVmReplication", propOrder = {"vmName", "hostName", "reason"})
public class IncompatibleHostForVmReplication extends ReplicationFault {
  @XmlElement(required = true)
  protected String vmName;
  
  @XmlElement(required = true)
  protected String hostName;
  
  @XmlElement(required = true)
  protected String reason;
  
  public String getVmName() {
    return this.vmName;
  }
  
  public void setVmName(String paramString) {
    this.vmName = paramString;
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
