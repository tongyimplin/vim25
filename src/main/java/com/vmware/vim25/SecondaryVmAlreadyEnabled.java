package com.vmware.vim25;

import com.vmware.vim25.SecondaryVmAlreadyEnabled;
import com.vmware.vim25.VmFaultToleranceIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecondaryVmAlreadyEnabled", propOrder = {"instanceUuid"})
public class SecondaryVmAlreadyEnabled extends VmFaultToleranceIssue {
  @XmlElement(required = true)
  protected String instanceUuid;
  
  public String getInstanceUuid() {
    return this.instanceUuid;
  }
  
  public void setInstanceUuid(String paramString) {
    this.instanceUuid = paramString;
  }
}
