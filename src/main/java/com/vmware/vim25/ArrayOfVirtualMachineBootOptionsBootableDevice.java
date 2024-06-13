package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineBootOptionsBootableDevice;
import com.vmware.vim25.VirtualMachineBootOptionsBootableDevice;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineBootOptionsBootableDevice", propOrder = {"virtualMachineBootOptionsBootableDevice"})
public class ArrayOfVirtualMachineBootOptionsBootableDevice {
  @XmlElement(name = "VirtualMachineBootOptionsBootableDevice")
  protected List<VirtualMachineBootOptionsBootableDevice> virtualMachineBootOptionsBootableDevice;
  
  public List<VirtualMachineBootOptionsBootableDevice> getVirtualMachineBootOptionsBootableDevice() {
    if (this.virtualMachineBootOptionsBootableDevice == null)
      this.virtualMachineBootOptionsBootableDevice = new ArrayList<>(); 
    return this.virtualMachineBootOptionsBootableDevice;
  }
}
