package com.vmware.vim25;

import com.vmware.vim25.InsufficientStandbyCpuResource;
import com.vmware.vim25.InsufficientStandbyResource;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientStandbyCpuResource", propOrder = {"available", "requested"})
public class InsufficientStandbyCpuResource extends InsufficientStandbyResource {
  protected long available;
  
  protected long requested;
  
  public long getAvailable() {
    return this.available;
  }
  
  public void setAvailable(long paramLong) {
    this.available = paramLong;
  }
  
  public long getRequested() {
    return this.requested;
  }
  
  public void setRequested(long paramLong) {
    this.requested = paramLong;
  }
}
