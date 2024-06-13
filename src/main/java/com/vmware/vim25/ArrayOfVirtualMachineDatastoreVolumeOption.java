package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineDatastoreVolumeOption;
import com.vmware.vim25.VirtualMachineDatastoreVolumeOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineDatastoreVolumeOption", propOrder = {"virtualMachineDatastoreVolumeOption"})
public class ArrayOfVirtualMachineDatastoreVolumeOption {
  @XmlElement(name = "VirtualMachineDatastoreVolumeOption")
  protected List<VirtualMachineDatastoreVolumeOption> virtualMachineDatastoreVolumeOption;
  
  public List<VirtualMachineDatastoreVolumeOption> getVirtualMachineDatastoreVolumeOption() {
    if (this.virtualMachineDatastoreVolumeOption == null)
      this.virtualMachineDatastoreVolumeOption = new ArrayList<>(); 
    return this.virtualMachineDatastoreVolumeOption;
  }
}
