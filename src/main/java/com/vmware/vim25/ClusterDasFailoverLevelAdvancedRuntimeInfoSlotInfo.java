package com.vmware.vim25;

import com.vmware.vim25.ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo", propOrder = {"numVcpus", "cpuMHz", "memoryMB"})
public class ClusterDasFailoverLevelAdvancedRuntimeInfoSlotInfo extends DynamicData {
  protected int numVcpus;
  
  protected int cpuMHz;
  
  protected int memoryMB;
  
  public int getNumVcpus() {
    return this.numVcpus;
  }
  
  public void setNumVcpus(int paramInt) {
    this.numVcpus = paramInt;
  }
  
  public int getCpuMHz() {
    return this.cpuMHz;
  }
  
  public void setCpuMHz(int paramInt) {
    this.cpuMHz = paramInt;
  }
  
  public int getMemoryMB() {
    return this.memoryMB;
  }
  
  public void setMemoryMB(int paramInt) {
    this.memoryMB = paramInt;
  }
}
