package com.vmware.vim25;

import com.vmware.vim25.LicenseAssignmentFailed;
import com.vmware.vim25.RuntimeFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LicenseAssignmentFailed", propOrder = {"reason"})
public class LicenseAssignmentFailed extends RuntimeFault {
  protected String reason;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
