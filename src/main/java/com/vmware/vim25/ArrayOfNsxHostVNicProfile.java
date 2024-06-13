package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNsxHostVNicProfile;
import com.vmware.vim25.NsxHostVNicProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNsxHostVNicProfile", propOrder = {"nsxHostVNicProfile"})
public class ArrayOfNsxHostVNicProfile {
  @XmlElement(name = "NsxHostVNicProfile")
  protected List<NsxHostVNicProfile> nsxHostVNicProfile;
  
  public List<NsxHostVNicProfile> getNsxHostVNicProfile() {
    if (this.nsxHostVNicProfile == null)
      this.nsxHostVNicProfile = new ArrayList<>(); 
    return this.nsxHostVNicProfile;
  }
}
