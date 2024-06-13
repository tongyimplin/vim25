package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineScsiDiskDeviceInfo;
import com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineScsiDiskDeviceInfo", propOrder = {"virtualMachineScsiDiskDeviceInfo"})
public class ArrayOfVirtualMachineScsiDiskDeviceInfo {
  @XmlElement(name = "VirtualMachineScsiDiskDeviceInfo")
  protected List<VirtualMachineScsiDiskDeviceInfo> virtualMachineScsiDiskDeviceInfo;
  
  public List<VirtualMachineScsiDiskDeviceInfo> getVirtualMachineScsiDiskDeviceInfo() {
    if (this.virtualMachineScsiDiskDeviceInfo == null)
      this.virtualMachineScsiDiskDeviceInfo = new ArrayList<>(); 
    return this.virtualMachineScsiDiskDeviceInfo;
  }
}
