package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineFloppyInfo;
import com.vmware.vim25.VirtualMachineFloppyInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineFloppyInfo", propOrder = {"virtualMachineFloppyInfo"})
public class ArrayOfVirtualMachineFloppyInfo {
  @XmlElement(name = "VirtualMachineFloppyInfo")
  protected List<VirtualMachineFloppyInfo> virtualMachineFloppyInfo;
  
  public List<VirtualMachineFloppyInfo> getVirtualMachineFloppyInfo() {
    if (this.virtualMachineFloppyInfo == null)
      this.virtualMachineFloppyInfo = new ArrayList<>(); 
    return this.virtualMachineFloppyInfo;
  }
}
