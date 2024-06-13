package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualDevice;
import com.vmware.vim25.VirtualHardware;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualHardware", propOrder = {"numCPU", "numCoresPerSocket", "memoryMB", "virtualICH7MPresent", "virtualSMCPresent", "device"})
public class VirtualHardware extends DynamicData {
  protected int numCPU;
  
  protected Integer numCoresPerSocket;
  
  protected int memoryMB;
  
  protected Boolean virtualICH7MPresent;
  
  protected Boolean virtualSMCPresent;
  
  protected List<VirtualDevice> device;
  
  public int getNumCPU() {
    return this.numCPU;
  }
  
  public void setNumCPU(int paramInt) {
    this.numCPU = paramInt;
  }
  
  public Integer getNumCoresPerSocket() {
    return this.numCoresPerSocket;
  }
  
  public void setNumCoresPerSocket(Integer paramInteger) {
    this.numCoresPerSocket = paramInteger;
  }
  
  public int getMemoryMB() {
    return this.memoryMB;
  }
  
  public void setMemoryMB(int paramInt) {
    this.memoryMB = paramInt;
  }
  
  public Boolean isVirtualICH7MPresent() {
    return this.virtualICH7MPresent;
  }
  
  public void setVirtualICH7MPresent(Boolean paramBoolean) {
    this.virtualICH7MPresent = paramBoolean;
  }
  
  public Boolean isVirtualSMCPresent() {
    return this.virtualSMCPresent;
  }
  
  public void setVirtualSMCPresent(Boolean paramBoolean) {
    this.virtualSMCPresent = paramBoolean;
  }
  
  public List<VirtualDevice> getDevice() {
    if (this.device == null)
      this.device = new ArrayList<>(); 
    return this.device;
  }
}
