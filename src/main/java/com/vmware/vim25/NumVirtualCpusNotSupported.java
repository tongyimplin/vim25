package com.vmware.vim25;

import com.vmware.vim25.NumVirtualCpusNotSupported;
import com.vmware.vim25.VirtualHardwareCompatibilityIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumVirtualCpusNotSupported", propOrder = {"maxSupportedVcpusDest", "numCpuVm"})
public class NumVirtualCpusNotSupported extends VirtualHardwareCompatibilityIssue {
  protected int maxSupportedVcpusDest;
  
  protected int numCpuVm;
  
  public int getMaxSupportedVcpusDest() {
    return this.maxSupportedVcpusDest;
  }
  
  public void setMaxSupportedVcpusDest(int paramInt) {
    this.maxSupportedVcpusDest = paramInt;
  }
  
  public int getNumCpuVm() {
    return this.numCpuVm;
  }
  
  public void setNumCpuVm(int paramInt) {
    this.numCpuVm = paramInt;
  }
}
