package com.vmware.vim25;

import com.vmware.vim25.InsufficientResourcesFault;
import com.vmware.vim25.VmSmpFaultToleranceTooManyVMsOnHost;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmSmpFaultToleranceTooManyVMsOnHost", propOrder = {"hostName", "maxNumSmpFtVms"})
public class VmSmpFaultToleranceTooManyVMsOnHost extends InsufficientResourcesFault {
  protected String hostName;
  
  protected int maxNumSmpFtVms;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public int getMaxNumSmpFtVms() {
    return this.maxNumSmpFtVms;
  }
  
  public void setMaxNumSmpFtVms(int paramInt) {
    this.maxNumSmpFtVms = paramInt;
  }
}
