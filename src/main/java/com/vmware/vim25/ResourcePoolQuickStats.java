package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ResourcePoolQuickStats;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResourcePoolQuickStats", propOrder = {"overallCpuUsage", "overallCpuDemand", "guestMemoryUsage", "hostMemoryUsage", "distributedCpuEntitlement", "distributedMemoryEntitlement", "staticCpuEntitlement", "staticMemoryEntitlement", "privateMemory", "sharedMemory", "swappedMemory", "balloonedMemory", "overheadMemory", "consumedOverheadMemory", "compressedMemory"})
public class ResourcePoolQuickStats extends DynamicData {
  protected Long overallCpuUsage;
  
  protected Long overallCpuDemand;
  
  protected Long guestMemoryUsage;
  
  protected Long hostMemoryUsage;
  
  protected Long distributedCpuEntitlement;
  
  protected Long distributedMemoryEntitlement;
  
  protected Integer staticCpuEntitlement;
  
  protected Integer staticMemoryEntitlement;
  
  protected Long privateMemory;
  
  protected Long sharedMemory;
  
  protected Long swappedMemory;
  
  protected Long balloonedMemory;
  
  protected Long overheadMemory;
  
  protected Long consumedOverheadMemory;
  
  protected Long compressedMemory;
  
  public Long getOverallCpuUsage() {
    return this.overallCpuUsage;
  }
  
  public void setOverallCpuUsage(Long paramLong) {
    this.overallCpuUsage = paramLong;
  }
  
  public Long getOverallCpuDemand() {
    return this.overallCpuDemand;
  }
  
  public void setOverallCpuDemand(Long paramLong) {
    this.overallCpuDemand = paramLong;
  }
  
  public Long getGuestMemoryUsage() {
    return this.guestMemoryUsage;
  }
  
  public void setGuestMemoryUsage(Long paramLong) {
    this.guestMemoryUsage = paramLong;
  }
  
  public Long getHostMemoryUsage() {
    return this.hostMemoryUsage;
  }
  
  public void setHostMemoryUsage(Long paramLong) {
    this.hostMemoryUsage = paramLong;
  }
  
  public Long getDistributedCpuEntitlement() {
    return this.distributedCpuEntitlement;
  }
  
  public void setDistributedCpuEntitlement(Long paramLong) {
    this.distributedCpuEntitlement = paramLong;
  }
  
  public Long getDistributedMemoryEntitlement() {
    return this.distributedMemoryEntitlement;
  }
  
  public void setDistributedMemoryEntitlement(Long paramLong) {
    this.distributedMemoryEntitlement = paramLong;
  }
  
  public Integer getStaticCpuEntitlement() {
    return this.staticCpuEntitlement;
  }
  
  public void setStaticCpuEntitlement(Integer paramInteger) {
    this.staticCpuEntitlement = paramInteger;
  }
  
  public Integer getStaticMemoryEntitlement() {
    return this.staticMemoryEntitlement;
  }
  
  public void setStaticMemoryEntitlement(Integer paramInteger) {
    this.staticMemoryEntitlement = paramInteger;
  }
  
  public Long getPrivateMemory() {
    return this.privateMemory;
  }
  
  public void setPrivateMemory(Long paramLong) {
    this.privateMemory = paramLong;
  }
  
  public Long getSharedMemory() {
    return this.sharedMemory;
  }
  
  public void setSharedMemory(Long paramLong) {
    this.sharedMemory = paramLong;
  }
  
  public Long getSwappedMemory() {
    return this.swappedMemory;
  }
  
  public void setSwappedMemory(Long paramLong) {
    this.swappedMemory = paramLong;
  }
  
  public Long getBalloonedMemory() {
    return this.balloonedMemory;
  }
  
  public void setBalloonedMemory(Long paramLong) {
    this.balloonedMemory = paramLong;
  }
  
  public Long getOverheadMemory() {
    return this.overheadMemory;
  }
  
  public void setOverheadMemory(Long paramLong) {
    this.overheadMemory = paramLong;
  }
  
  public Long getConsumedOverheadMemory() {
    return this.consumedOverheadMemory;
  }
  
  public void setConsumedOverheadMemory(Long paramLong) {
    this.consumedOverheadMemory = paramLong;
  }
  
  public Long getCompressedMemory() {
    return this.compressedMemory;
  }
  
  public void setCompressedMemory(Long paramLong) {
    this.compressedMemory = paramLong;
  }
}
