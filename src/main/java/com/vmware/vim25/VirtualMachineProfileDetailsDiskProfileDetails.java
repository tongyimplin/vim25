package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineProfileDetailsDiskProfileDetails;
import com.vmware.vim25.VirtualMachineProfileSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineProfileDetailsDiskProfileDetails", propOrder = {"diskId", "profile"})
public class VirtualMachineProfileDetailsDiskProfileDetails extends DynamicData {
  protected int diskId;
  
  protected List<VirtualMachineProfileSpec> profile;
  
  public int getDiskId() {
    return this.diskId;
  }
  
  public void setDiskId(int paramInt) {
    this.diskId = paramInt;
  }
  
  public List<VirtualMachineProfileSpec> getProfile() {
    if (this.profile == null)
      this.profile = new ArrayList<>(); 
    return this.profile;
  }
}
