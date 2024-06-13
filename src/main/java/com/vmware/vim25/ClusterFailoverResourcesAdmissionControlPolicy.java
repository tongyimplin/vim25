package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAdmissionControlPolicy;
import com.vmware.vim25.ClusterFailoverResourcesAdmissionControlPolicy;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFailoverResourcesAdmissionControlPolicy", propOrder = {"cpuFailoverResourcesPercent", "memoryFailoverResourcesPercent", "failoverLevel", "autoComputePercentages"})
public class ClusterFailoverResourcesAdmissionControlPolicy extends ClusterDasAdmissionControlPolicy {
  protected int cpuFailoverResourcesPercent;
  
  protected int memoryFailoverResourcesPercent;
  
  protected Integer failoverLevel;
  
  protected Boolean autoComputePercentages;
  
  public int getCpuFailoverResourcesPercent() {
    return this.cpuFailoverResourcesPercent;
  }
  
  public void setCpuFailoverResourcesPercent(int paramInt) {
    this.cpuFailoverResourcesPercent = paramInt;
  }
  
  public int getMemoryFailoverResourcesPercent() {
    return this.memoryFailoverResourcesPercent;
  }
  
  public void setMemoryFailoverResourcesPercent(int paramInt) {
    this.memoryFailoverResourcesPercent = paramInt;
  }
  
  public Integer getFailoverLevel() {
    return this.failoverLevel;
  }
  
  public void setFailoverLevel(Integer paramInteger) {
    this.failoverLevel = paramInteger;
  }
  
  public Boolean isAutoComputePercentages() {
    return this.autoComputePercentages;
  }
  
  public void setAutoComputePercentages(Boolean paramBoolean) {
    this.autoComputePercentages = paramBoolean;
  }
}
