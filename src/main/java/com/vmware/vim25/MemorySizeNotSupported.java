package com.vmware.vim25;

import com.vmware.vim25.MemorySizeNotSupported;
import com.vmware.vim25.VirtualHardwareCompatibilityIssue;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MemorySizeNotSupported", propOrder = {"memorySizeMB", "minMemorySizeMB", "maxMemorySizeMB"})
public class MemorySizeNotSupported extends VirtualHardwareCompatibilityIssue {
  protected int memorySizeMB;
  
  protected int minMemorySizeMB;
  
  protected int maxMemorySizeMB;
  
  public int getMemorySizeMB() {
    return this.memorySizeMB;
  }
  
  public void setMemorySizeMB(int paramInt) {
    this.memorySizeMB = paramInt;
  }
  
  public int getMinMemorySizeMB() {
    return this.minMemorySizeMB;
  }
  
  public void setMinMemorySizeMB(int paramInt) {
    this.minMemorySizeMB = paramInt;
  }
  
  public int getMaxMemorySizeMB() {
    return this.maxMemorySizeMB;
  }
  
  public void setMaxMemorySizeMB(int paramInt) {
    this.maxMemorySizeMB = paramInt;
  }
}
