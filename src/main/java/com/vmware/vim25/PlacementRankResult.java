package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PlacementRankResult;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlacementRankResult", propOrder = {"key", "candidate", "reservedSpaceMB", "usedSpaceMB", "totalSpaceMB", "utilization", "faults"})
public class PlacementRankResult extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected ManagedObjectReference candidate;
  
  protected long reservedSpaceMB;
  
  protected long usedSpaceMB;
  
  protected long totalSpaceMB;
  
  protected double utilization;
  
  protected List<LocalizedMethodFault> faults;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public ManagedObjectReference getCandidate() {
    return this.candidate;
  }
  
  public void setCandidate(ManagedObjectReference paramManagedObjectReference) {
    this.candidate = paramManagedObjectReference;
  }
  
  public long getReservedSpaceMB() {
    return this.reservedSpaceMB;
  }
  
  public void setReservedSpaceMB(long paramLong) {
    this.reservedSpaceMB = paramLong;
  }
  
  public long getUsedSpaceMB() {
    return this.usedSpaceMB;
  }
  
  public void setUsedSpaceMB(long paramLong) {
    this.usedSpaceMB = paramLong;
  }
  
  public long getTotalSpaceMB() {
    return this.totalSpaceMB;
  }
  
  public void setTotalSpaceMB(long paramLong) {
    this.totalSpaceMB = paramLong;
  }
  
  public double getUtilization() {
    return this.utilization;
  }
  
  public void setUtilization(double paramDouble) {
    this.utilization = paramDouble;
  }
  
  public List<LocalizedMethodFault> getFaults() {
    if (this.faults == null)
      this.faults = new ArrayList<>(); 
    return this.faults;
  }
}
