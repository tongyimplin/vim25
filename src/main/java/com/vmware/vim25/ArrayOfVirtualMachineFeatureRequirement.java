package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineFeatureRequirement;
import com.vmware.vim25.VirtualMachineFeatureRequirement;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineFeatureRequirement", propOrder = {"virtualMachineFeatureRequirement"})
public class ArrayOfVirtualMachineFeatureRequirement {
  @XmlElement(name = "VirtualMachineFeatureRequirement")
  protected List<VirtualMachineFeatureRequirement> virtualMachineFeatureRequirement;
  
  public List<VirtualMachineFeatureRequirement> getVirtualMachineFeatureRequirement() {
    if (this.virtualMachineFeatureRequirement == null)
      this.virtualMachineFeatureRequirement = new ArrayList<>(); 
    return this.virtualMachineFeatureRequirement;
  }
}
