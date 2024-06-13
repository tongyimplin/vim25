package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineFileLayoutSnapshotLayout;
import com.vmware.vim25.VirtualMachineFileLayoutSnapshotLayout;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineFileLayoutSnapshotLayout", propOrder = {"virtualMachineFileLayoutSnapshotLayout"})
public class ArrayOfVirtualMachineFileLayoutSnapshotLayout {
  @XmlElement(name = "VirtualMachineFileLayoutSnapshotLayout")
  protected List<VirtualMachineFileLayoutSnapshotLayout> virtualMachineFileLayoutSnapshotLayout;
  
  public List<VirtualMachineFileLayoutSnapshotLayout> getVirtualMachineFileLayoutSnapshotLayout() {
    if (this.virtualMachineFileLayoutSnapshotLayout == null)
      this.virtualMachineFileLayoutSnapshotLayout = new ArrayList<>(); 
    return this.virtualMachineFileLayoutSnapshotLayout;
  }
}
