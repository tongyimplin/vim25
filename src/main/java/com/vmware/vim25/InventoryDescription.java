package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.InventoryDescription;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InventoryDescription", propOrder = {"numHosts", "numVirtualMachines", "numResourcePools", "numClusters", "numCpuDev", "numNetDev", "numDiskDev", "numvCpuDev", "numvNetDev", "numvDiskDev"})
public class InventoryDescription extends DynamicData {
  protected int numHosts;
  
  protected int numVirtualMachines;
  
  protected Integer numResourcePools;
  
  protected Integer numClusters;
  
  protected Integer numCpuDev;
  
  protected Integer numNetDev;
  
  protected Integer numDiskDev;
  
  protected Integer numvCpuDev;
  
  protected Integer numvNetDev;
  
  protected Integer numvDiskDev;
  
  public int getNumHosts() {
    return this.numHosts;
  }
  
  public void setNumHosts(int paramInt) {
    this.numHosts = paramInt;
  }
  
  public int getNumVirtualMachines() {
    return this.numVirtualMachines;
  }
  
  public void setNumVirtualMachines(int paramInt) {
    this.numVirtualMachines = paramInt;
  }
  
  public Integer getNumResourcePools() {
    return this.numResourcePools;
  }
  
  public void setNumResourcePools(Integer paramInteger) {
    this.numResourcePools = paramInteger;
  }
  
  public Integer getNumClusters() {
    return this.numClusters;
  }
  
  public void setNumClusters(Integer paramInteger) {
    this.numClusters = paramInteger;
  }
  
  public Integer getNumCpuDev() {
    return this.numCpuDev;
  }
  
  public void setNumCpuDev(Integer paramInteger) {
    this.numCpuDev = paramInteger;
  }
  
  public Integer getNumNetDev() {
    return this.numNetDev;
  }
  
  public void setNumNetDev(Integer paramInteger) {
    this.numNetDev = paramInteger;
  }
  
  public Integer getNumDiskDev() {
    return this.numDiskDev;
  }
  
  public void setNumDiskDev(Integer paramInteger) {
    this.numDiskDev = paramInteger;
  }
  
  public Integer getNumvCpuDev() {
    return this.numvCpuDev;
  }
  
  public void setNumvCpuDev(Integer paramInteger) {
    this.numvCpuDev = paramInteger;
  }
  
  public Integer getNumvNetDev() {
    return this.numvNetDev;
  }
  
  public void setNumvNetDev(Integer paramInteger) {
    this.numvNetDev = paramInteger;
  }
  
  public Integer getNumvDiskDev() {
    return this.numvDiskDev;
  }
  
  public void setNumvDiskDev(Integer paramInteger) {
    this.numvDiskDev = paramInteger;
  }
}
