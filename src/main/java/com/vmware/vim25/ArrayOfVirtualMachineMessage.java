package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineMessage;
import com.vmware.vim25.VirtualMachineMessage;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineMessage", propOrder = {"virtualMachineMessage"})
public class ArrayOfVirtualMachineMessage {
  @XmlElement(name = "VirtualMachineMessage")
  protected List<VirtualMachineMessage> virtualMachineMessage;
  
  public List<VirtualMachineMessage> getVirtualMachineMessage() {
    if (this.virtualMachineMessage == null)
      this.virtualMachineMessage = new ArrayList<>(); 
    return this.virtualMachineMessage;
  }
}
