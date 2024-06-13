package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NvdimmSummary;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NvdimmSummary", propOrder = {"numDimms", "healthStatus", "totalCapacity", "persistentCapacity", "blockCapacity", "availableCapacity", "numInterleavesets", "numNamespaces"})
public class NvdimmSummary extends DynamicData {
  protected int numDimms;
  
  @XmlElement(required = true)
  protected String healthStatus;
  
  protected long totalCapacity;
  
  protected long persistentCapacity;
  
  protected long blockCapacity;
  
  protected long availableCapacity;
  
  protected int numInterleavesets;
  
  protected int numNamespaces;
  
  public int getNumDimms() {
    return this.numDimms;
  }
  
  public void setNumDimms(int paramInt) {
    this.numDimms = paramInt;
  }
  
  public String getHealthStatus() {
    return this.healthStatus;
  }
  
  public void setHealthStatus(String paramString) {
    this.healthStatus = paramString;
  }
  
  public long getTotalCapacity() {
    return this.totalCapacity;
  }
  
  public void setTotalCapacity(long paramLong) {
    this.totalCapacity = paramLong;
  }
  
  public long getPersistentCapacity() {
    return this.persistentCapacity;
  }
  
  public void setPersistentCapacity(long paramLong) {
    this.persistentCapacity = paramLong;
  }
  
  public long getBlockCapacity() {
    return this.blockCapacity;
  }
  
  public void setBlockCapacity(long paramLong) {
    this.blockCapacity = paramLong;
  }
  
  public long getAvailableCapacity() {
    return this.availableCapacity;
  }
  
  public void setAvailableCapacity(long paramLong) {
    this.availableCapacity = paramLong;
  }
  
  public int getNumInterleavesets() {
    return this.numInterleavesets;
  }
  
  public void setNumInterleavesets(int paramInt) {
    this.numInterleavesets = paramInt;
  }
  
  public int getNumNamespaces() {
    return this.numNamespaces;
  }
  
  public void setNumNamespaces(int paramInt) {
    this.numNamespaces = paramInt;
  }
}
