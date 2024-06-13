package com.vmware.vim25;

import com.vmware.vim25.FaultToleranceNotLicensed;
import com.vmware.vim25.VmFaultToleranceIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FaultToleranceNotLicensed", propOrder = {"hostName"})
public class FaultToleranceNotLicensed extends VmFaultToleranceIssue {
  protected String hostName;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
}
