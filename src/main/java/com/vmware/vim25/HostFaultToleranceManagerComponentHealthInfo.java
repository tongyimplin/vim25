package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostFaultToleranceManagerComponentHealthInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFaultToleranceManagerComponentHealthInfo", propOrder = {"isStorageHealthy", "isNetworkHealthy"})
public class HostFaultToleranceManagerComponentHealthInfo extends DynamicData {
  protected boolean isStorageHealthy;
  
  protected boolean isNetworkHealthy;
  
  public boolean isIsStorageHealthy() {
    return this.isStorageHealthy;
  }
  
  public void setIsStorageHealthy(boolean paramBoolean) {
    this.isStorageHealthy = paramBoolean;
  }
  
  public boolean isIsNetworkHealthy() {
    return this.isNetworkHealthy;
  }
  
  public void setIsNetworkHealthy(boolean paramBoolean) {
    this.isNetworkHealthy = paramBoolean;
  }
}
