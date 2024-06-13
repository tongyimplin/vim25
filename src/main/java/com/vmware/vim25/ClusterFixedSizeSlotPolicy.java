package com.vmware.vim25;

import com.vmware.vim25.ClusterFixedSizeSlotPolicy;
import com.vmware.vim25.ClusterSlotPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFixedSizeSlotPolicy", propOrder = {"cpu", "memory"})
public class ClusterFixedSizeSlotPolicy extends ClusterSlotPolicy {
  protected int cpu;
  
  protected int memory;
  
  public int getCpu() {
    return this.cpu;
  }
  
  public void setCpu(int paramInt) {
    this.cpu = paramInt;
  }
  
  public int getMemory() {
    return this.memory;
  }
  
  public void setMemory(int paramInt) {
    this.memory = paramInt;
  }
}
