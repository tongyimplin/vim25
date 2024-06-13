package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPhysicalNicProfile;
import com.vmware.vim25.PhysicalNicProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPhysicalNicProfile", propOrder = {"physicalNicProfile"})
public class ArrayOfPhysicalNicProfile {
  @XmlElement(name = "PhysicalNicProfile")
  protected List<PhysicalNicProfile> physicalNicProfile;
  
  public List<PhysicalNicProfile> getPhysicalNicProfile() {
    if (this.physicalNicProfile == null)
      this.physicalNicProfile = new ArrayList<>(); 
    return this.physicalNicProfile;
  }
}
