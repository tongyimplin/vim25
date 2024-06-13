package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.RuntimeFault;
import com.vmware.vim25.UnexpectedFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnexpectedFault", propOrder = {"faultName", "fault"})
public class UnexpectedFault extends RuntimeFault {
  @XmlElement(required = true)
  protected String faultName;
  
  protected LocalizedMethodFault fault;
  
  public String getFaultName() {
    return this.faultName;
  }
  
  public void setFaultName(String paramString) {
    this.faultName = paramString;
  }
  
  public LocalizedMethodFault getFault() {
    return this.fault;
  }
  
  public void setFault(LocalizedMethodFault paramLocalizedMethodFault) {
    this.fault = paramLocalizedMethodFault;
  }
}
