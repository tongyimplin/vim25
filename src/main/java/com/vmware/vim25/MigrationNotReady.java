package com.vmware.vim25;

import com.vmware.vim25.MigrationFault;
import com.vmware.vim25.MigrationNotReady;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MigrationNotReady", propOrder = {"reason"})
public class MigrationNotReady extends MigrationFault {
  @XmlElement(required = true)
  protected String reason;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
