package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineSnapshotTree;
import com.vmware.vim25.VirtualMachineSnapshotTree;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineSnapshotTree", propOrder = {"virtualMachineSnapshotTree"})
public class ArrayOfVirtualMachineSnapshotTree {
  @XmlElement(name = "VirtualMachineSnapshotTree")
  protected List<VirtualMachineSnapshotTree> virtualMachineSnapshotTree;
  
  public List<VirtualMachineSnapshotTree> getVirtualMachineSnapshotTree() {
    if (this.virtualMachineSnapshotTree == null)
      this.virtualMachineSnapshotTree = new ArrayList<>(); 
    return this.virtualMachineSnapshotTree;
  }
}
