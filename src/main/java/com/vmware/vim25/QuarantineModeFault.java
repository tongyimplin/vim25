package com.vmware.vim25;

import com.vmware.vim25.QuarantineModeFault;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QuarantineModeFault", propOrder = {"vmName", "faultType"})
public class QuarantineModeFault extends VmConfigFault {
  @XmlElement(required = true)
  protected String vmName;
  
  @XmlElement(required = true)
  protected String faultType;
  
  public String getVmName() {
    return this.vmName;
  }
  
  public void setVmName(String paramString) {
    this.vmName = paramString;
  }
  
  public String getFaultType() {
    return this.faultType;
  }
  
  public void setFaultType(String paramString) {
    this.faultType = paramString;
  }
}
