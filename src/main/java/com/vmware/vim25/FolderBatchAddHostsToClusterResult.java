package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FolderBatchAddHostsToClusterResult;
import com.vmware.vim25.FolderFailedHostResult;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderBatchAddHostsToClusterResult", propOrder = {"hostsAddedToCluster", "hostsFailedInventoryAdd", "hostsFailedMoveToCluster"})
public class FolderBatchAddHostsToClusterResult extends DynamicData {
  protected List<ManagedObjectReference> hostsAddedToCluster;
  
  protected List<FolderFailedHostResult> hostsFailedInventoryAdd;
  
  protected List<FolderFailedHostResult> hostsFailedMoveToCluster;
  
  public List<ManagedObjectReference> getHostsAddedToCluster() {
    if (this.hostsAddedToCluster == null)
      this.hostsAddedToCluster = new ArrayList<>(); 
    return this.hostsAddedToCluster;
  }
  
  public List<FolderFailedHostResult> getHostsFailedInventoryAdd() {
    if (this.hostsFailedInventoryAdd == null)
      this.hostsFailedInventoryAdd = new ArrayList<>(); 
    return this.hostsFailedInventoryAdd;
  }
  
  public List<FolderFailedHostResult> getHostsFailedMoveToCluster() {
    if (this.hostsFailedMoveToCluster == null)
      this.hostsFailedMoveToCluster = new ArrayList<>(); 
    return this.hostsFailedMoveToCluster;
  }
}
