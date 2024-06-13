package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineUsbInfo;
import com.vmware.vim25.VirtualMachineUsbInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineUsbInfo", propOrder = {"virtualMachineUsbInfo"})
public class ArrayOfVirtualMachineUsbInfo {
  @XmlElement(name = "VirtualMachineUsbInfo")
  protected List<VirtualMachineUsbInfo> virtualMachineUsbInfo;
  
  public List<VirtualMachineUsbInfo> getVirtualMachineUsbInfo() {
    if (this.virtualMachineUsbInfo == null)
      this.virtualMachineUsbInfo = new ArrayList<>(); 
    return this.virtualMachineUsbInfo;
  }
}
