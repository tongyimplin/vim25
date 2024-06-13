package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineFileLayoutDiskLayout;
import com.vmware.vim25.VirtualMachineFileLayoutDiskLayout;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineFileLayoutDiskLayout", propOrder = {"virtualMachineFileLayoutDiskLayout"})
public class ArrayOfVirtualMachineFileLayoutDiskLayout {
  @XmlElement(name = "VirtualMachineFileLayoutDiskLayout")
  protected List<VirtualMachineFileLayoutDiskLayout> virtualMachineFileLayoutDiskLayout;
  
  public List<VirtualMachineFileLayoutDiskLayout> getVirtualMachineFileLayoutDiskLayout() {
    if (this.virtualMachineFileLayoutDiskLayout == null)
      this.virtualMachineFileLayoutDiskLayout = new ArrayList<>(); 
    return this.virtualMachineFileLayoutDiskLayout;
  }
}
