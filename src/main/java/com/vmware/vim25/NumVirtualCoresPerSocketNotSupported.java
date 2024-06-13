package com.vmware.vim25;

import com.vmware.vim25.NumVirtualCoresPerSocketNotSupported;
import com.vmware.vim25.VirtualHardwareCompatibilityIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumVirtualCoresPerSocketNotSupported", propOrder = {"maxSupportedCoresPerSocketDest", "numCoresPerSocketVm"})
public class NumVirtualCoresPerSocketNotSupported extends VirtualHardwareCompatibilityIssue {
  protected int maxSupportedCoresPerSocketDest;
  
  protected int numCoresPerSocketVm;
  
  public int getMaxSupportedCoresPerSocketDest() {
    return this.maxSupportedCoresPerSocketDest;
  }
  
  public void setMaxSupportedCoresPerSocketDest(int paramInt) {
    this.maxSupportedCoresPerSocketDest = paramInt;
  }
  
  public int getNumCoresPerSocketVm() {
    return this.numCoresPerSocketVm;
  }
  
  public void setNumCoresPerSocketVm(int paramInt) {
    this.numCoresPerSocketVm = paramInt;
  }
}
