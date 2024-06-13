package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineIdeDiskDeviceInfo;
import com.vmware.vim25.VirtualMachineIdeDiskDeviceInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineIdeDiskDeviceInfo", propOrder = {"virtualMachineIdeDiskDeviceInfo"})
public class ArrayOfVirtualMachineIdeDiskDeviceInfo {
  @XmlElement(name = "VirtualMachineIdeDiskDeviceInfo")
  protected List<VirtualMachineIdeDiskDeviceInfo> virtualMachineIdeDiskDeviceInfo;
  
  public List<VirtualMachineIdeDiskDeviceInfo> getVirtualMachineIdeDiskDeviceInfo() {
    if (this.virtualMachineIdeDiskDeviceInfo == null)
      this.virtualMachineIdeDiskDeviceInfo = new ArrayList<>(); 
    return this.virtualMachineIdeDiskDeviceInfo;
  }
}
