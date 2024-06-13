package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAdmissionControlInfo;
import com.vmware.vim25.ClusterFailoverResourcesAdmissionControlInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterFailoverResourcesAdmissionControlInfo", propOrder = {"currentCpuFailoverResourcesPercent", "currentMemoryFailoverResourcesPercent"})
public class ClusterFailoverResourcesAdmissionControlInfo extends ClusterDasAdmissionControlInfo {
  protected int currentCpuFailoverResourcesPercent;
  
  protected int currentMemoryFailoverResourcesPercent;
  
  public int getCurrentCpuFailoverResourcesPercent() {
    return this.currentCpuFailoverResourcesPercent;
  }
  
  public void setCurrentCpuFailoverResourcesPercent(int paramInt) {
    this.currentCpuFailoverResourcesPercent = paramInt;
  }
  
  public int getCurrentMemoryFailoverResourcesPercent() {
    return this.currentMemoryFailoverResourcesPercent;
  }
  
  public void setCurrentMemoryFailoverResourcesPercent(int paramInt) {
    this.currentMemoryFailoverResourcesPercent = paramInt;
  }
}
