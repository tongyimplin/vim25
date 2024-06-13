package com.vmware.vim25;

import com.vmware.vim25.ClusterUsageSummary;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterUsageSummary", propOrder = {"totalCpuCapacityMhz", "totalMemCapacityMB", "cpuReservationMhz", "memReservationMB", "poweredOffCpuReservationMhz", "poweredOffMemReservationMB", "cpuDemandMhz", "memDemandMB", "statsGenNumber", "cpuEntitledMhz", "memEntitledMB", "poweredOffVmCount", "totalVmCount"})
public class ClusterUsageSummary extends DynamicData {
  protected int totalCpuCapacityMhz;
  
  protected int totalMemCapacityMB;
  
  protected int cpuReservationMhz;
  
  protected int memReservationMB;
  
  protected Integer poweredOffCpuReservationMhz;
  
  protected Integer poweredOffMemReservationMB;
  
  protected int cpuDemandMhz;
  
  protected int memDemandMB;
  
  protected long statsGenNumber;
  
  protected int cpuEntitledMhz;
  
  protected int memEntitledMB;
  
  protected int poweredOffVmCount;
  
  protected int totalVmCount;
  
  public int getTotalCpuCapacityMhz() {
    return this.totalCpuCapacityMhz;
  }
  
  public void setTotalCpuCapacityMhz(int paramInt) {
    this.totalCpuCapacityMhz = paramInt;
  }
  
  public int getTotalMemCapacityMB() {
    return this.totalMemCapacityMB;
  }
  
  public void setTotalMemCapacityMB(int paramInt) {
    this.totalMemCapacityMB = paramInt;
  }
  
  public int getCpuReservationMhz() {
    return this.cpuReservationMhz;
  }
  
  public void setCpuReservationMhz(int paramInt) {
    this.cpuReservationMhz = paramInt;
  }
  
  public int getMemReservationMB() {
    return this.memReservationMB;
  }
  
  public void setMemReservationMB(int paramInt) {
    this.memReservationMB = paramInt;
  }
  
  public Integer getPoweredOffCpuReservationMhz() {
    return this.poweredOffCpuReservationMhz;
  }
  
  public void setPoweredOffCpuReservationMhz(Integer paramInteger) {
    this.poweredOffCpuReservationMhz = paramInteger;
  }
  
  public Integer getPoweredOffMemReservationMB() {
    return this.poweredOffMemReservationMB;
  }
  
  public void setPoweredOffMemReservationMB(Integer paramInteger) {
    this.poweredOffMemReservationMB = paramInteger;
  }
  
  public int getCpuDemandMhz() {
    return this.cpuDemandMhz;
  }
  
  public void setCpuDemandMhz(int paramInt) {
    this.cpuDemandMhz = paramInt;
  }
  
  public int getMemDemandMB() {
    return this.memDemandMB;
  }
  
  public void setMemDemandMB(int paramInt) {
    this.memDemandMB = paramInt;
  }
  
  public long getStatsGenNumber() {
    return this.statsGenNumber;
  }
  
  public void setStatsGenNumber(long paramLong) {
    this.statsGenNumber = paramLong;
  }
  
  public int getCpuEntitledMhz() {
    return this.cpuEntitledMhz;
  }
  
  public void setCpuEntitledMhz(int paramInt) {
    this.cpuEntitledMhz = paramInt;
  }
  
  public int getMemEntitledMB() {
    return this.memEntitledMB;
  }
  
  public void setMemEntitledMB(int paramInt) {
    this.memEntitledMB = paramInt;
  }
  
  public int getPoweredOffVmCount() {
    return this.poweredOffVmCount;
  }
  
  public void setPoweredOffVmCount(int paramInt) {
    this.poweredOffVmCount = paramInt;
  }
  
  public int getTotalVmCount() {
    return this.totalVmCount;
  }
  
  public void setTotalVmCount(int paramInt) {
    this.totalVmCount = paramInt;
  }
}
