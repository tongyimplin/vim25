package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineFileLayoutExDiskLayout;
import com.vmware.vim25.VirtualMachineFileLayoutExDiskLayout;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineFileLayoutExDiskLayout", propOrder = {"virtualMachineFileLayoutExDiskLayout"})
public class ArrayOfVirtualMachineFileLayoutExDiskLayout {
  @XmlElement(name = "VirtualMachineFileLayoutExDiskLayout")
  protected List<VirtualMachineFileLayoutExDiskLayout> virtualMachineFileLayoutExDiskLayout;
  
  public List<VirtualMachineFileLayoutExDiskLayout> getVirtualMachineFileLayoutExDiskLayout() {
    if (this.virtualMachineFileLayoutExDiskLayout == null)
      this.virtualMachineFileLayoutExDiskLayout = new ArrayList<>(); 
    return this.virtualMachineFileLayoutExDiskLayout;
  }
}
