package com.vmware.vim25;

import com.vmware.vim25.ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo", propOrder = {"storageAPDSupported", "storagePDLSupported"})
public class ClusterDasAdvancedRuntimeInfoVmcpCapabilityInfo extends DynamicData {
  protected boolean storageAPDSupported;
  
  protected boolean storagePDLSupported;
  
  public boolean isStorageAPDSupported() {
    return this.storageAPDSupported;
  }
  
  public void setStorageAPDSupported(boolean paramBoolean) {
    this.storageAPDSupported = paramBoolean;
  }
  
  public boolean isStoragePDLSupported() {
    return this.storagePDLSupported;
  }
  
  public void setStoragePDLSupported(boolean paramBoolean) {
    this.storagePDLSupported = paramBoolean;
  }
}
