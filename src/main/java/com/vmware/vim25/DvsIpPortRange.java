package com.vmware.vim25;

import com.vmware.vim25.DvsIpPort;
import com.vmware.vim25.DvsIpPortRange;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DvsIpPortRange", propOrder = {"startPortNumber", "endPortNumber"})
public class DvsIpPortRange extends DvsIpPort {
  protected int startPortNumber;
  
  protected int endPortNumber;
  
  public int getStartPortNumber() {
    return this.startPortNumber;
  }
  
  public void setStartPortNumber(int paramInt) {
    this.startPortNumber = paramInt;
  }
  
  public int getEndPortNumber() {
    return this.endPortNumber;
  }
  
  public void setEndPortNumber(int paramInt) {
    this.endPortNumber = paramInt;
  }
}
