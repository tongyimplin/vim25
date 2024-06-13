package com.vmware.vim25;

import com.vmware.vim25.ClusterComputeResourceClusterConfigResult;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FolderFailedHostResult;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ClusterComputeResourceClusterConfigResult", propOrder = {"failedHosts", "configuredHosts"})
public class ClusterComputeResourceClusterConfigResult extends DynamicData {
  protected List<FolderFailedHostResult> failedHosts;
  
  protected List<ManagedObjectReference> configuredHosts;
  
  public List<FolderFailedHostResult> getFailedHosts() {
    if (this.failedHosts == null)
      this.failedHosts = new ArrayList<>(); 
    return this.failedHosts;
  }
  
  public List<ManagedObjectReference> getConfiguredHosts() {
    if (this.configuredHosts == null)
      this.configuredHosts = new ArrayList<>(); 
    return this.configuredHosts;
  }
}
