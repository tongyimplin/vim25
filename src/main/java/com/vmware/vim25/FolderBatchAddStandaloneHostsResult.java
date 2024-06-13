package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.FolderBatchAddStandaloneHostsResult;
import com.vmware.vim25.FolderFailedHostResult;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FolderBatchAddStandaloneHostsResult", propOrder = {"addedHosts", "hostsFailedInventoryAdd"})
public class FolderBatchAddStandaloneHostsResult extends DynamicData {
  protected List<ManagedObjectReference> addedHosts;
  
  protected List<FolderFailedHostResult> hostsFailedInventoryAdd;
  
  public List<ManagedObjectReference> getAddedHosts() {
    if (this.addedHosts == null)
      this.addedHosts = new ArrayList<>(); 
    return this.addedHosts;
  }
  
  public List<FolderFailedHostResult> getHostsFailedInventoryAdd() {
    if (this.hostsFailedInventoryAdd == null)
      this.hostsFailedInventoryAdd = new ArrayList<>(); 
    return this.hostsFailedInventoryAdd;
  }
}
