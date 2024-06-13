package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualMachineProfileDetailsDiskProfileDetails;
import com.vmware.vim25.VirtualMachineProfileDetailsDiskProfileDetails;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualMachineProfileDetailsDiskProfileDetails", propOrder = {"virtualMachineProfileDetailsDiskProfileDetails"})
public class ArrayOfVirtualMachineProfileDetailsDiskProfileDetails {
  @XmlElement(name = "VirtualMachineProfileDetailsDiskProfileDetails")
  protected List<VirtualMachineProfileDetailsDiskProfileDetails> virtualMachineProfileDetailsDiskProfileDetails;
  
  public List<VirtualMachineProfileDetailsDiskProfileDetails> getVirtualMachineProfileDetailsDiskProfileDetails() {
    if (this.virtualMachineProfileDetailsDiskProfileDetails == null)
      this.virtualMachineProfileDetailsDiskProfileDetails = new ArrayList<>(); 
    return this.virtualMachineProfileDetailsDiskProfileDetails;
  }
}
