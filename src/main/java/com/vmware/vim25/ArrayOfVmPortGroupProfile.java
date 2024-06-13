package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVmPortGroupProfile;
import com.vmware.vim25.VmPortGroupProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVmPortGroupProfile", propOrder = {"vmPortGroupProfile"})
public class ArrayOfVmPortGroupProfile {
  @XmlElement(name = "VmPortGroupProfile")
  protected List<VmPortGroupProfile> vmPortGroupProfile;
  
  public List<VmPortGroupProfile> getVmPortGroupProfile() {
    if (this.vmPortGroupProfile == null)
      this.vmPortGroupProfile = new ArrayList<>(); 
    return this.vmPortGroupProfile;
  }
}
