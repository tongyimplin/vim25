package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineDiskDeviceInfo;
import com.vmware.vim25.VirtualMachineIdeDiskDeviceInfo;
import com.vmware.vim25.VirtualMachineIdeDiskDevicePartitionInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineIdeDiskDeviceInfo", propOrder = {"partitionTable"})
public class VirtualMachineIdeDiskDeviceInfo extends VirtualMachineDiskDeviceInfo {
  protected List<VirtualMachineIdeDiskDevicePartitionInfo> partitionTable;
  
  public List<VirtualMachineIdeDiskDevicePartitionInfo> getPartitionTable() {
    if (this.partitionTable == null)
      this.partitionTable = new ArrayList<>(); 
    return this.partitionTable;
  }
}
