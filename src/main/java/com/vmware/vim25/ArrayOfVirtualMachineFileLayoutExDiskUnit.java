package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineFileLayoutExDiskUnit;
import com.vmware.vim25.VirtualMachineFileLayoutExDiskUnit;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineFileLayoutExDiskUnit", propOrder = {"virtualMachineFileLayoutExDiskUnit"})
public class ArrayOfVirtualMachineFileLayoutExDiskUnit {
  @XmlElement(name = "VirtualMachineFileLayoutExDiskUnit")
  protected List<VirtualMachineFileLayoutExDiskUnit> virtualMachineFileLayoutExDiskUnit;
  
  public List<VirtualMachineFileLayoutExDiskUnit> getVirtualMachineFileLayoutExDiskUnit() {
    if (this.virtualMachineFileLayoutExDiskUnit == null)
      this.virtualMachineFileLayoutExDiskUnit = new ArrayList<>(); 
    return this.virtualMachineFileLayoutExDiskUnit;
  }
}
