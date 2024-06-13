package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineSerialInfo;
import com.vmware.vim25.VirtualMachineSerialInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineSerialInfo", propOrder = {"virtualMachineSerialInfo"})
public class ArrayOfVirtualMachineSerialInfo {
  @XmlElement(name = "VirtualMachineSerialInfo")
  protected List<VirtualMachineSerialInfo> virtualMachineSerialInfo;
  
  public List<VirtualMachineSerialInfo> getVirtualMachineSerialInfo() {
    if (this.virtualMachineSerialInfo == null)
      this.virtualMachineSerialInfo = new ArrayList<>(); 
    return this.virtualMachineSerialInfo;
  }
}
