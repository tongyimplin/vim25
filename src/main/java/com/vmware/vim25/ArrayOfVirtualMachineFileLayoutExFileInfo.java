package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineFileLayoutExFileInfo;
import com.vmware.vim25.VirtualMachineFileLayoutExFileInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineFileLayoutExFileInfo", propOrder = {"virtualMachineFileLayoutExFileInfo"})
public class ArrayOfVirtualMachineFileLayoutExFileInfo {
  @XmlElement(name = "VirtualMachineFileLayoutExFileInfo")
  protected List<VirtualMachineFileLayoutExFileInfo> virtualMachineFileLayoutExFileInfo;
  
  public List<VirtualMachineFileLayoutExFileInfo> getVirtualMachineFileLayoutExFileInfo() {
    if (this.virtualMachineFileLayoutExFileInfo == null)
      this.virtualMachineFileLayoutExFileInfo = new ArrayList<>(); 
    return this.virtualMachineFileLayoutExFileInfo;
  }
}
