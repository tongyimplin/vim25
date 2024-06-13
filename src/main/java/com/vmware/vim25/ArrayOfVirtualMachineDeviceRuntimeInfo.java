package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineDeviceRuntimeInfo;
import com.vmware.vim25.VirtualMachineDeviceRuntimeInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineDeviceRuntimeInfo", propOrder = {"virtualMachineDeviceRuntimeInfo"})
public class ArrayOfVirtualMachineDeviceRuntimeInfo {
  @XmlElement(name = "VirtualMachineDeviceRuntimeInfo")
  protected List<VirtualMachineDeviceRuntimeInfo> virtualMachineDeviceRuntimeInfo;
  
  public List<VirtualMachineDeviceRuntimeInfo> getVirtualMachineDeviceRuntimeInfo() {
    if (this.virtualMachineDeviceRuntimeInfo == null)
      this.virtualMachineDeviceRuntimeInfo = new ArrayList<>(); 
    return this.virtualMachineDeviceRuntimeInfo;
  }
}
