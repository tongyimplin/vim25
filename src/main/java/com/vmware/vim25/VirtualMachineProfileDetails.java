package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineProfileDetails;
import com.vmware.vim25.VirtualMachineProfileDetailsDiskProfileDetails;
import com.vmware.vim25.VirtualMachineProfileSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineProfileDetails", propOrder = {"profile", "diskProfileDetails"})
public class VirtualMachineProfileDetails extends DynamicData {
  protected List<VirtualMachineProfileSpec> profile;
  
  protected List<VirtualMachineProfileDetailsDiskProfileDetails> diskProfileDetails;
  
  public List<VirtualMachineProfileSpec> getProfile() {
    if (this.profile == null)
      this.profile = new ArrayList<>(); 
    return this.profile;
  }
  
  public List<VirtualMachineProfileDetailsDiskProfileDetails> getDiskProfileDetails() {
    if (this.diskProfileDetails == null)
      this.diskProfileDetails = new ArrayList<>(); 
    return this.diskProfileDetails;
  }
}
