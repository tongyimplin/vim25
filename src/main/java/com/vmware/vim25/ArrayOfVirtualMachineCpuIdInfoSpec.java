package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineCpuIdInfoSpec;
import com.vmware.vim25.VirtualMachineCpuIdInfoSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineCpuIdInfoSpec", propOrder = {"virtualMachineCpuIdInfoSpec"})
public class ArrayOfVirtualMachineCpuIdInfoSpec {
  @XmlElement(name = "VirtualMachineCpuIdInfoSpec")
  protected List<VirtualMachineCpuIdInfoSpec> virtualMachineCpuIdInfoSpec;
  
  public List<VirtualMachineCpuIdInfoSpec> getVirtualMachineCpuIdInfoSpec() {
    if (this.virtualMachineCpuIdInfoSpec == null)
      this.virtualMachineCpuIdInfoSpec = new ArrayList<>(); 
    return this.virtualMachineCpuIdInfoSpec;
  }
}
