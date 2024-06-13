package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineSnapshotInfo;
import com.vmware.vim25.VirtualMachineSnapshotTree;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSnapshotInfo", propOrder = {"currentSnapshot", "rootSnapshotList"})
public class VirtualMachineSnapshotInfo extends DynamicData {
  protected ManagedObjectReference currentSnapshot;
  
  @XmlElement(required = true)
  protected List<VirtualMachineSnapshotTree> rootSnapshotList;
  
  public ManagedObjectReference getCurrentSnapshot() {
    return this.currentSnapshot;
  }
  
  public void setCurrentSnapshot(ManagedObjectReference paramManagedObjectReference) {
    this.currentSnapshot = paramManagedObjectReference;
  }
  
  public List<VirtualMachineSnapshotTree> getRootSnapshotList() {
    if (this.rootSnapshotList == null)
      this.rootSnapshotList = new ArrayList<>(); 
    return this.rootSnapshotList;
  }
}
