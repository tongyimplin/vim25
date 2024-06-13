package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPortGroupProfile;
import com.vmware.vim25.HostPortGroupProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPortGroupProfile", propOrder = {"hostPortGroupProfile"})
public class ArrayOfHostPortGroupProfile {
  @XmlElement(name = "HostPortGroupProfile")
  protected List<HostPortGroupProfile> hostPortGroupProfile;
  
  public List<HostPortGroupProfile> getHostPortGroupProfile() {
    if (this.hostPortGroupProfile == null)
      this.hostPortGroupProfile = new ArrayList<>(); 
    return this.hostPortGroupProfile;
  }
}
