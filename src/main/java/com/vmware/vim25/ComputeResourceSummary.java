package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceSummary;
import com.vmware.vim25.ComputeResourceSummary;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedEntityStatus;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComputeResourceSummary", propOrder = {"totalCpu", "totalMemory", "numCpuCores", "numCpuThreads", "effectiveCpu", "effectiveMemory", "numHosts", "numEffectiveHosts", "overallStatus"})
@XmlSeeAlso({ClusterComputeResourceSummary.class})
public class ComputeResourceSummary extends DynamicData {
  protected int totalCpu;
  
  protected long totalMemory;
  
  protected short numCpuCores;
  
  protected short numCpuThreads;
  
  protected int effectiveCpu;
  
  protected long effectiveMemory;
  
  protected int numHosts;
  
  protected int numEffectiveHosts;
  
  @XmlElement(required = true)
  protected ManagedEntityStatus overallStatus;
  
  public int getTotalCpu() {
    return this.totalCpu;
  }
  
  public void setTotalCpu(int paramInt) {
    this.totalCpu = paramInt;
  }
  
  public long getTotalMemory() {
    return this.totalMemory;
  }
  
  public void setTotalMemory(long paramLong) {
    this.totalMemory = paramLong;
  }
  
  public short getNumCpuCores() {
    return this.numCpuCores;
  }
  
  public void setNumCpuCores(short paramShort) {
    this.numCpuCores = paramShort;
  }
  
  public short getNumCpuThreads() {
    return this.numCpuThreads;
  }
  
  public void setNumCpuThreads(short paramShort) {
    this.numCpuThreads = paramShort;
  }
  
  public int getEffectiveCpu() {
    return this.effectiveCpu;
  }
  
  public void setEffectiveCpu(int paramInt) {
    this.effectiveCpu = paramInt;
  }
  
  public long getEffectiveMemory() {
    return this.effectiveMemory;
  }
  
  public void setEffectiveMemory(long paramLong) {
    this.effectiveMemory = paramLong;
  }
  
  public int getNumHosts() {
    return this.numHosts;
  }
  
  public void setNumHosts(int paramInt) {
    this.numHosts = paramInt;
  }
  
  public int getNumEffectiveHosts() {
    return this.numEffectiveHosts;
  }
  
  public void setNumEffectiveHosts(int paramInt) {
    this.numEffectiveHosts = paramInt;
  }
  
  public ManagedEntityStatus getOverallStatus() {
    return this.overallStatus;
  }
  
  public void setOverallStatus(ManagedEntityStatus paramManagedEntityStatus) {
    this.overallStatus = paramManagedEntityStatus;
  }
}
