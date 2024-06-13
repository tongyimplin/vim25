package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineIdeDiskDevicePartitionInfo;
import com.vmware.vim25.VirtualMachineIdeDiskDevicePartitionInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineIdeDiskDevicePartitionInfo", propOrder = {"virtualMachineIdeDiskDevicePartitionInfo"})
public class ArrayOfVirtualMachineIdeDiskDevicePartitionInfo {
  @XmlElement(name = "VirtualMachineIdeDiskDevicePartitionInfo")
  protected List<VirtualMachineIdeDiskDevicePartitionInfo> virtualMachineIdeDiskDevicePartitionInfo;
  
  public List<VirtualMachineIdeDiskDevicePartitionInfo> getVirtualMachineIdeDiskDevicePartitionInfo() {
    if (this.virtualMachineIdeDiskDevicePartitionInfo == null)
      this.virtualMachineIdeDiskDevicePartitionInfo = new ArrayList<>(); 
    return this.virtualMachineIdeDiskDevicePartitionInfo;
  }
}
