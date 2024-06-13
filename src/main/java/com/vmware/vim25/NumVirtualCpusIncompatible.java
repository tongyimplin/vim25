package com.vmware.vim25;

import com.vmware.vim25.NumVirtualCpusIncompatible;
import com.vmware.vim25.VmConfigFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumVirtualCpusIncompatible", propOrder = {"reason", "numCpu"})
public class NumVirtualCpusIncompatible extends VmConfigFault {
  @XmlElement(required = true)
  protected String reason;
  
  protected int numCpu;
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
  
  public int getNumCpu() {
    return this.numCpu;
  }
  
  public void setNumCpu(int paramInt) {
    this.numCpu = paramInt;
  }
}
