package com.vmware.vim25;

import com.vmware.vim25.NotEnoughCpus;
import com.vmware.vim25.NotEnoughLogicalCpus;
import com.vmware.vim25.VirtualHardwareCompatibilityIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NotEnoughCpus", propOrder = {"numCpuDest", "numCpuVm"})
@XmlSeeAlso({NotEnoughLogicalCpus.class})
public class NotEnoughCpus extends VirtualHardwareCompatibilityIssue {
  protected int numCpuDest;
  
  protected int numCpuVm;
  
  public int getNumCpuDest() {
    return this.numCpuDest;
  }
  
  public void setNumCpuDest(int paramInt) {
    this.numCpuDest = paramInt;
  }
  
  public int getNumCpuVm() {
    return this.numCpuVm;
  }
  
  public void setNumCpuVm(int paramInt) {
    this.numCpuVm = paramInt;
  }
}
