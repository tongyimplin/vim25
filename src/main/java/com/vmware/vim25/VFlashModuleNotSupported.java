package com.vmware.vim25;

import com.vmware.vim25.VFlashModuleNotSupported;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VFlashModuleNotSupported", propOrder = {"vmName", "moduleName", "reason", "hostName"})
public class VFlashModuleNotSupported extends VmConfigFault {
  @XmlElement(required = true)
  protected String vmName;
  
  @XmlElement(required = true)
  protected String moduleName;
  
  @XmlElement(required = true)
  protected String reason;
  
  @XmlElement(required = true)
  protected String hostName;
  
  public String getVmName() {
    return this.vmName;
  }
  
  public void setVmName(String paramString) {
    this.vmName = paramString;
  }
  
  public String getModuleName() {
    return this.moduleName;
  }
  
  public void setModuleName(String paramString) {
    this.moduleName = paramString;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
}
