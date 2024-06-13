package com.vmware.vim25;

import com.vmware.vim25.ClusterRuleInfo;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PodDiskLocator;
import com.vmware.vim25.StorageDrsVmConfigInfo;
import com.vmware.vim25.VmPodConfigForPlacement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VmPodConfigForPlacement", propOrder = {"storagePod", "disk", "vmConfig", "interVmRule"})
public class VmPodConfigForPlacement extends DynamicData {
  @XmlElement(required = true)
  protected ManagedObjectReference storagePod;
  
  protected List<PodDiskLocator> disk;
  
  protected StorageDrsVmConfigInfo vmConfig;
  
  protected List<ClusterRuleInfo> interVmRule;
  
  public ManagedObjectReference getStoragePod() {
    return this.storagePod;
  }
  
  public void setStoragePod(ManagedObjectReference paramManagedObjectReference) {
    this.storagePod = paramManagedObjectReference;
  }
  
  public List<PodDiskLocator> getDisk() {
    if (this.disk == null)
      this.disk = new ArrayList<>(); 
    return this.disk;
  }
  
  public StorageDrsVmConfigInfo getVmConfig() {
    return this.vmConfig;
  }
  
  public void setVmConfig(StorageDrsVmConfigInfo paramStorageDrsVmConfigInfo) {
    this.vmConfig = paramStorageDrsVmConfigInfo;
  }
  
  public List<ClusterRuleInfo> getInterVmRule() {
    if (this.interVmRule == null)
      this.interVmRule = new ArrayList<>(); 
    return this.interVmRule;
  }
}
