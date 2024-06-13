package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostListSummaryQuickStats;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostListSummaryQuickStats", propOrder = {"overallCpuUsage", "overallMemoryUsage", "distributedCpuFairness", "distributedMemoryFairness", "availablePMemCapacity", "uptime"})
public class HostListSummaryQuickStats extends DynamicData {
  protected Integer overallCpuUsage;
  
  protected Integer overallMemoryUsage;
  
  protected Integer distributedCpuFairness;
  
  protected Integer distributedMemoryFairness;
  
  protected Integer availablePMemCapacity;
  
  protected Integer uptime;
  
  public Integer getOverallCpuUsage() {
    return this.overallCpuUsage;
  }
  
  public void setOverallCpuUsage(Integer paramInteger) {
    this.overallCpuUsage = paramInteger;
  }
  
  public Integer getOverallMemoryUsage() {
    return this.overallMemoryUsage;
  }
  
  public void setOverallMemoryUsage(Integer paramInteger) {
    this.overallMemoryUsage = paramInteger;
  }
  
  public Integer getDistributedCpuFairness() {
    return this.distributedCpuFairness;
  }
  
  public void setDistributedCpuFairness(Integer paramInteger) {
    this.distributedCpuFairness = paramInteger;
  }
  
  public Integer getDistributedMemoryFairness() {
    return this.distributedMemoryFairness;
  }
  
  public void setDistributedMemoryFairness(Integer paramInteger) {
    this.distributedMemoryFairness = paramInteger;
  }
  
  public Integer getAvailablePMemCapacity() {
    return this.availablePMemCapacity;
  }
  
  public void setAvailablePMemCapacity(Integer paramInteger) {
    this.availablePMemCapacity = paramInteger;
  }
  
  public Integer getUptime() {
    return this.uptime;
  }
  
  public void setUptime(Integer paramInteger) {
    this.uptime = paramInteger;
  }
}
