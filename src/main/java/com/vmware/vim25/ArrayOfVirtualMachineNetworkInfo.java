package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineNetworkInfo;
import com.vmware.vim25.VirtualMachineNetworkInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineNetworkInfo", propOrder = {"virtualMachineNetworkInfo"})
public class ArrayOfVirtualMachineNetworkInfo {
  @XmlElement(name = "VirtualMachineNetworkInfo")
  protected List<VirtualMachineNetworkInfo> virtualMachineNetworkInfo;
  
  public List<VirtualMachineNetworkInfo> getVirtualMachineNetworkInfo() {
    if (this.virtualMachineNetworkInfo == null)
      this.virtualMachineNetworkInfo = new ArrayList<>(); 
    return this.virtualMachineNetworkInfo;
  }
}
