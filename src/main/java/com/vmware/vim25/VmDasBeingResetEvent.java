package com.vmware.vim25;

import com.vmware.vim25.VmDasBeingResetEvent;
import com.vmware.vim25.VmDasBeingResetWithScreenshotEvent;
import com.vmware.vim25.VmEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmDasBeingResetEvent", propOrder = {"reason"})
@XmlSeeAlso({VmDasBeingResetWithScreenshotEvent.class})
public class VmDasBeingResetEvent extends VmEvent {
  protected String reason;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
