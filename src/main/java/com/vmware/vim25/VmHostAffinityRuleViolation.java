package com.vmware.vim25;

import com.vmware.vim25.VmConfigFault;
import com.vmware.vim25.VmHostAffinityRuleViolation;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmHostAffinityRuleViolation", propOrder = {"vmName", "hostName"})
public class VmHostAffinityRuleViolation extends VmConfigFault {
  @XmlElement(required = true)
  protected String vmName;
  
  @XmlElement(required = true)
  protected String hostName;
  
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
}
