package com.vmware.vim25;

import com.vmware.vim25.InsufficientResourcesFault;
import com.vmware.vim25.VmFaultToleranceTooManyVMsOnHost;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFaultToleranceTooManyVMsOnHost", propOrder = {"hostName", "maxNumFtVms"})
public class VmFaultToleranceTooManyVMsOnHost extends InsufficientResourcesFault {
  protected String hostName;
  
  protected int maxNumFtVms;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public int getMaxNumFtVms() {
    return this.maxNumFtVms;
  }
  
  public void setMaxNumFtVms(int paramInt) {
    this.maxNumFtVms = paramInt;
  }
}
