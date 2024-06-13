package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineDiskDeviceInfo;
import com.vmware.vim25.VirtualMachineIdeDiskDeviceInfo;
import com.vmware.vim25.VirtualMachineScsiDiskDeviceInfo;
import com.vmware.vim25.VirtualMachineTargetInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDiskDeviceInfo", propOrder = {"capacity", "vm"})
@XmlSeeAlso({VirtualMachineScsiDiskDeviceInfo.class, VirtualMachineIdeDiskDeviceInfo.class})
public class VirtualMachineDiskDeviceInfo extends VirtualMachineTargetInfo {
  protected Long capacity;
  
  protected List<ManagedObjectReference> vm;
  
  public Long getCapacity() {
    return this.capacity;
  }
  
  public void setCapacity(Long paramLong) {
    this.capacity = paramLong;
  }
  
  public List<ManagedObjectReference> getVm() {
    if (this.vm == null)
      this.vm = new ArrayList<>(); 
    return this.vm;
  }
}
