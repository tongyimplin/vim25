package com.vmware.vim25;

import com.vmware.vim25.GenericVmConfigFault;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenericVmConfigFault", propOrder = {"reason"})
public class GenericVmConfigFault extends VmConfigFault {
  @XmlElement(required = true)
  protected String reason;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
