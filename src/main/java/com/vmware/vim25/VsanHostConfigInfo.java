package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VsanHostConfigInfo;
import com.vmware.vim25.VsanHostConfigInfoClusterInfo;
import com.vmware.vim25.VsanHostConfigInfoNetworkInfo;
import com.vmware.vim25.VsanHostConfigInfoStorageInfo;
import com.vmware.vim25.VsanHostFaultDomainInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostConfigInfo", propOrder = {"enabled", "hostSystem", "clusterInfo", "storageInfo", "networkInfo", "faultDomainInfo"})
public class VsanHostConfigInfo extends DynamicData {
  protected Boolean enabled;
  
  protected ManagedObjectReference hostSystem;
  
  protected VsanHostConfigInfoClusterInfo clusterInfo;
  
  protected VsanHostConfigInfoStorageInfo storageInfo;
  
  protected VsanHostConfigInfoNetworkInfo networkInfo;
  
  protected VsanHostFaultDomainInfo faultDomainInfo;
  
  public Boolean isEnabled() {
    return this.enabled;
  }
  
  public void setEnabled(Boolean paramBoolean) {
    this.enabled = paramBoolean;
  }
  
  public ManagedObjectReference getHostSystem() {
    return this.hostSystem;
  }
  
  public void setHostSystem(ManagedObjectReference paramManagedObjectReference) {
    this.hostSystem = paramManagedObjectReference;
  }
  
  public VsanHostConfigInfoClusterInfo getClusterInfo() {
    return this.clusterInfo;
  }
  
  public void setClusterInfo(VsanHostConfigInfoClusterInfo paramVsanHostConfigInfoClusterInfo) {
    this.clusterInfo = paramVsanHostConfigInfoClusterInfo;
  }
  
  public VsanHostConfigInfoStorageInfo getStorageInfo() {
    return this.storageInfo;
  }
  
  public void setStorageInfo(VsanHostConfigInfoStorageInfo paramVsanHostConfigInfoStorageInfo) {
    this.storageInfo = paramVsanHostConfigInfoStorageInfo;
  }
  
  public VsanHostConfigInfoNetworkInfo getNetworkInfo() {
    return this.networkInfo;
  }
  
  public void setNetworkInfo(VsanHostConfigInfoNetworkInfo paramVsanHostConfigInfoNetworkInfo) {
    this.networkInfo = paramVsanHostConfigInfoNetworkInfo;
  }
  
  public VsanHostFaultDomainInfo getFaultDomainInfo() {
    return this.faultDomainInfo;
  }
  
  public void setFaultDomainInfo(VsanHostFaultDomainInfo paramVsanHostFaultDomainInfo) {
    this.faultDomainInfo = paramVsanHostFaultDomainInfo;
  }
}
