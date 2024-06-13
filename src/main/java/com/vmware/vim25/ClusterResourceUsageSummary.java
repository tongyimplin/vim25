package com.vmware.vim25;

import com.vmware.vim25.ClusterResourceUsageSummary;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterResourceUsageSummary", propOrder = {"cpuUsedMHz", "cpuCapacityMHz", "memUsedMB", "memCapacityMB", "pMemAvailableMB", "pMemCapacityMB", "storageUsedMB", "storageCapacityMB"})
public class ClusterResourceUsageSummary extends DynamicData {
  protected int cpuUsedMHz;
  
  protected int cpuCapacityMHz;
  
  protected int memUsedMB;
  
  protected int memCapacityMB;
  
  protected Long pMemAvailableMB;
  
  protected Long pMemCapacityMB;
  
  protected long storageUsedMB;
  
  protected long storageCapacityMB;
  
  public int getCpuUsedMHz() {
    return this.cpuUsedMHz;
  }
  
  public void setCpuUsedMHz(int paramInt) {
    this.cpuUsedMHz = paramInt;
  }
  
  public int getCpuCapacityMHz() {
    return this.cpuCapacityMHz;
  }
  
  public void setCpuCapacityMHz(int paramInt) {
    this.cpuCapacityMHz = paramInt;
  }
  
  public int getMemUsedMB() {
    return this.memUsedMB;
  }
  
  public void setMemUsedMB(int paramInt) {
    this.memUsedMB = paramInt;
  }
  
  public int getMemCapacityMB() {
    return this.memCapacityMB;
  }
  
  public void setMemCapacityMB(int paramInt) {
    this.memCapacityMB = paramInt;
  }
  
  public Long getPMemAvailableMB() {
    return this.pMemAvailableMB;
  }
  
  public void setPMemAvailableMB(Long paramLong) {
    this.pMemAvailableMB = paramLong;
  }
  
  public Long getPMemCapacityMB() {
    return this.pMemCapacityMB;
  }
  
  public void setPMemCapacityMB(Long paramLong) {
    this.pMemCapacityMB = paramLong;
  }
  
  public long getStorageUsedMB() {
    return this.storageUsedMB;
  }
  
  public void setStorageUsedMB(long paramLong) {
    this.storageUsedMB = paramLong;
  }
  
  public long getStorageCapacityMB() {
    return this.storageCapacityMB;
  }
  
  public void setStorageCapacityMB(long paramLong) {
    this.storageCapacityMB = paramLong;
  }
}
