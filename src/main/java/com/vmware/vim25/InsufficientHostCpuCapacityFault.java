package com.vmware.vim25;

import com.vmware.vim25.InsufficientHostCapacityFault;
import com.vmware.vim25.InsufficientHostCpuCapacityFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientHostCpuCapacityFault", propOrder = {"unreserved", "requested"})
public class InsufficientHostCpuCapacityFault extends InsufficientHostCapacityFault {
  protected long unreserved;
  
  protected long requested;
  
  public long getUnreserved() {
    return this.unreserved;
  }
  
  public void setUnreserved(long paramLong) {
    this.unreserved = paramLong;
  }
  
  public long getRequested() {
    return this.requested;
  }
  
  public void setRequested(long paramLong) {
    this.requested = paramLong;
  }
}
