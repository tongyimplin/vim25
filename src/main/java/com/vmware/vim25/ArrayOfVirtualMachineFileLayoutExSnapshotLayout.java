package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineFileLayoutExSnapshotLayout;
import com.vmware.vim25.VirtualMachineFileLayoutExSnapshotLayout;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineFileLayoutExSnapshotLayout", propOrder = {"virtualMachineFileLayoutExSnapshotLayout"})
public class ArrayOfVirtualMachineFileLayoutExSnapshotLayout {
  @XmlElement(name = "VirtualMachineFileLayoutExSnapshotLayout")
  protected List<VirtualMachineFileLayoutExSnapshotLayout> virtualMachineFileLayoutExSnapshotLayout;
  
  public List<VirtualMachineFileLayoutExSnapshotLayout> getVirtualMachineFileLayoutExSnapshotLayout() {
    if (this.virtualMachineFileLayoutExSnapshotLayout == null)
      this.virtualMachineFileLayoutExSnapshotLayout = new ArrayList<>(); 
    return this.virtualMachineFileLayoutExSnapshotLayout;
  }
}
