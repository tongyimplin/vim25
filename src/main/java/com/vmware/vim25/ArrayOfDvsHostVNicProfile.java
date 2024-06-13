package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDvsHostVNicProfile;
import com.vmware.vim25.DvsHostVNicProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDvsHostVNicProfile", propOrder = {"dvsHostVNicProfile"})
public class ArrayOfDvsHostVNicProfile {
  @XmlElement(name = "DvsHostVNicProfile")
  protected List<DvsHostVNicProfile> dvsHostVNicProfile;
  
  public List<DvsHostVNicProfile> getDvsHostVNicProfile() {
    if (this.dvsHostVNicProfile == null)
      this.dvsHostVNicProfile = new ArrayList<>(); 
    return this.dvsHostVNicProfile;
  }
}
