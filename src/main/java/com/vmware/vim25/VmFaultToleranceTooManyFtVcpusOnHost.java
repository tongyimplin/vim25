package com.vmware.vim25;

import com.vmware.vim25.InsufficientResourcesFault;
import com.vmware.vim25.VmFaultToleranceTooManyFtVcpusOnHost;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmFaultToleranceTooManyFtVcpusOnHost", propOrder = {"hostName", "maxNumFtVcpus"})
public class VmFaultToleranceTooManyFtVcpusOnHost extends InsufficientResourcesFault {
  protected String hostName;
  
  protected int maxNumFtVcpus;
  
  public String getHostName() {
    return this.hostName;
  }
  
  public void setHostName(String paramString) {
    this.hostName = paramString;
  }
  
  public int getMaxNumFtVcpus() {
    return this.maxNumFtVcpus;
  }
  
  public void setMaxNumFtVcpus(int paramInt) {
    this.maxNumFtVcpus = paramInt;
  }
}
