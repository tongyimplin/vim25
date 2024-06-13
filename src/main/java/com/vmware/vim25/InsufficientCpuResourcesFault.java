package com.vmware.vim25;

import com.vmware.vim25.InsufficientCpuResourcesFault;
import com.vmware.vim25.InsufficientResourcesFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientCpuResourcesFault", propOrder = {"unreserved", "requested"})
public class InsufficientCpuResourcesFault extends InsufficientResourcesFault {
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
