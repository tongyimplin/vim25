package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedEntityStatus;
import com.vmware.vim25.VirtualMachineQuickStats;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineQuickStats", propOrder = {"overallCpuUsage", "overallCpuDemand", "overallCpuReadiness", "guestMemoryUsage", "hostMemoryUsage", "guestHeartbeatStatus", "distributedCpuEntitlement", "distributedMemoryEntitlement", "staticCpuEntitlement", "staticMemoryEntitlement", "grantedMemory", "privateMemory", "sharedMemory", "swappedMemory", "balloonedMemory", "consumedOverheadMemory", "ftLogBandwidth", "ftSecondaryLatency", "ftLatencyStatus", "compressedMemory", "uptimeSeconds", "ssdSwappedMemory"})
public class VirtualMachineQuickStats extends DynamicData {
  protected Integer overallCpuUsage;
  
  protected Integer overallCpuDemand;
  
  protected Integer overallCpuReadiness;
  
  protected Integer guestMemoryUsage;
  
  protected Integer hostMemoryUsage;
  
  @XmlElement(required = true)
  protected ManagedEntityStatus guestHeartbeatStatus;
  
  protected Integer distributedCpuEntitlement;
  
  protected Integer distributedMemoryEntitlement;
  
  protected Integer staticCpuEntitlement;
  
  protected Integer staticMemoryEntitlement;
  
  protected Integer grantedMemory;
  
  protected Integer privateMemory;
  
  protected Integer sharedMemory;
  
  protected Integer swappedMemory;
  
  protected Integer balloonedMemory;
  
  protected Integer consumedOverheadMemory;
  
  protected Integer ftLogBandwidth;
  
  protected Integer ftSecondaryLatency;
  
  protected ManagedEntityStatus ftLatencyStatus;
  
  protected Long compressedMemory;
  
  protected Integer uptimeSeconds;
  
  protected Long ssdSwappedMemory;
  
  public Integer getOverallCpuUsage() {
    return this.overallCpuUsage;
  }
  
  public void setOverallCpuUsage(Integer paramInteger) {
    this.overallCpuUsage = paramInteger;
  }
  
  public Integer getOverallCpuDemand() {
    return this.overallCpuDemand;
  }
  
  public void setOverallCpuDemand(Integer paramInteger) {
    this.overallCpuDemand = paramInteger;
  }
  
  public Integer getOverallCpuReadiness() {
    return this.overallCpuReadiness;
  }
  
  public void setOverallCpuReadiness(Integer paramInteger) {
    this.overallCpuReadiness = paramInteger;
  }
  
  public Integer getGuestMemoryUsage() {
    return this.guestMemoryUsage;
  }
  
  public void setGuestMemoryUsage(Integer paramInteger) {
    this.guestMemoryUsage = paramInteger;
  }
  
  public Integer getHostMemoryUsage() {
    return this.hostMemoryUsage;
  }
  
  public void setHostMemoryUsage(Integer paramInteger) {
    this.hostMemoryUsage = paramInteger;
  }
  
  public ManagedEntityStatus getGuestHeartbeatStatus() {
    return this.guestHeartbeatStatus;
  }
  
  public void setGuestHeartbeatStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.guestHeartbeatStatus = paramManagedEntityStatus;
  }
  
  public Integer getDistributedCpuEntitlement() {
    return this.distributedCpuEntitlement;
  }
  
  public void setDistributedCpuEntitlement(Integer paramInteger) {
    this.distributedCpuEntitlement = paramInteger;
  }
  
  public Integer getDistributedMemoryEntitlement() {
    return this.distributedMemoryEntitlement;
  }
  
  public void setDistributedMemoryEntitlement(Integer paramInteger) {
    this.distributedMemoryEntitlement = paramInteger;
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
  
  public Integer getGrantedMemory() {
    return this.grantedMemory;
  }
  
  public void setGrantedMemory(Integer paramInteger) {
    this.grantedMemory = paramInteger;
  }
  
  public Integer getPrivateMemory() {
    return this.privateMemory;
  }
  
  public void setPrivateMemory(Integer paramInteger) {
    this.privateMemory = paramInteger;
  }
  
  public Integer getSharedMemory() {
    return this.sharedMemory;
  }
  
  public void setSharedMemory(Integer paramInteger) {
    this.sharedMemory = paramInteger;
  }
  
  public Integer getSwappedMemory() {
    return this.swappedMemory;
  }
  
  public void setSwappedMemory(Integer paramInteger) {
    this.swappedMemory = paramInteger;
  }
  
  public Integer getBalloonedMemory() {
    return this.balloonedMemory;
  }
  
  public void setBalloonedMemory(Integer paramInteger) {
    this.balloonedMemory = paramInteger;
  }
  
  public Integer getConsumedOverheadMemory() {
    return this.consumedOverheadMemory;
  }
  
  public void setConsumedOverheadMemory(Integer paramInteger) {
    this.consumedOverheadMemory = paramInteger;
  }
  
  public Integer getFtLogBandwidth() {
    return this.ftLogBandwidth;
  }
  
  public void setFtLogBandwidth(Integer paramInteger) {
    this.ftLogBandwidth = paramInteger;
  }
  
  public Integer getFtSecondaryLatency() {
    return this.ftSecondaryLatency;
  }
  
  public void setFtSecondaryLatency(Integer paramInteger) {
    this.ftSecondaryLatency = paramInteger;
  }
  
  public ManagedEntityStatus getFtLatencyStatus() {
    return this.ftLatencyStatus;
  }
  
  public void setFtLatencyStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.ftLatencyStatus = paramManagedEntityStatus;
  }
  
  public Long getCompressedMemory() {
    return this.compressedMemory;
  }
  
  public void setCompressedMemory(Long paramLong) {
    this.compressedMemory = paramLong;
  }
  
  public Integer getUptimeSeconds() {
    return this.uptimeSeconds;
  }
  
  public void setUptimeSeconds(Integer paramInteger) {
    this.uptimeSeconds = paramInteger;
  }
  
  public Long getSsdSwappedMemory() {
    return this.ssdSwappedMemory;
  }
  
  public void setSsdSwappedMemory(Long paramLong) {
    this.ssdSwappedMemory = paramLong;
  }
}
