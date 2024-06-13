package com.vmware.vim25;

import com.vmware.vim25.InsufficientResourcesFault;
import com.vmware.vim25.NumVirtualCpusExceedsLimit;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumVirtualCpusExceedsLimit", propOrder = {"maxSupportedVcpus"})
public class NumVirtualCpusExceedsLimit extends InsufficientResourcesFault {
  protected int maxSupportedVcpus;
  
  public int getMaxSupportedVcpus() {
    return this.maxSupportedVcpus;
  }
  
  public void setMaxSupportedVcpus(int paramInt) {
    this.maxSupportedVcpus = paramInt;
  }
}
