package com.vmware.vim25;

import com.vmware.vim25.InsufficientResourcesFault;
import com.vmware.vim25.InsufficientVFlashResourcesFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsufficientVFlashResourcesFault", propOrder = {"freeSpaceInMB", "freeSpace", "requestedSpaceInMB", "requestedSpace"})
public class InsufficientVFlashResourcesFault extends InsufficientResourcesFault {
  protected Long freeSpaceInMB;
  
  protected long freeSpace;
  
  protected Long requestedSpaceInMB;
  
  protected long requestedSpace;
  
  public Long getFreeSpaceInMB() {
    return this.freeSpaceInMB;
  }
  
  public void setFreeSpaceInMB(Long paramLong) {
    this.freeSpaceInMB = paramLong;
  }
  
  public long getFreeSpace() {
    return this.freeSpace;
  }
  
  public void setFreeSpace(long paramLong) {
    this.freeSpace = paramLong;
  }
  
  public Long getRequestedSpaceInMB() {
    return this.requestedSpaceInMB;
  }
  
  public void setRequestedSpaceInMB(Long paramLong) {
    this.requestedSpaceInMB = paramLong;
  }
  
  public long getRequestedSpace() {
    return this.requestedSpace;
  }
  
  public void setRequestedSpace(long paramLong) {
    this.requestedSpace = paramLong;
  }
}
