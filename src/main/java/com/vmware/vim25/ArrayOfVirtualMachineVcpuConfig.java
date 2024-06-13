package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineVcpuConfig;
import com.vmware.vim25.VirtualMachineVcpuConfig;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineVcpuConfig", propOrder = {"virtualMachineVcpuConfig"})
public class ArrayOfVirtualMachineVcpuConfig {
  @XmlElement(name = "VirtualMachineVcpuConfig")
  protected List<VirtualMachineVcpuConfig> virtualMachineVcpuConfig;
  
  public List<VirtualMachineVcpuConfig> getVirtualMachineVcpuConfig() {
    if (this.virtualMachineVcpuConfig == null)
      this.virtualMachineVcpuConfig = new ArrayList<>(); 
    return this.virtualMachineVcpuConfig;
  }
}
