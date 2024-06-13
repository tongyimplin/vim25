package com.vmware.vim25;

import com.vmware.vim25.ArrayOfNetStackInstanceProfile;
import com.vmware.vim25.NetStackInstanceProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNetStackInstanceProfile", propOrder = {"netStackInstanceProfile"})
public class ArrayOfNetStackInstanceProfile {
  @XmlElement(name = "NetStackInstanceProfile")
  protected List<NetStackInstanceProfile> netStackInstanceProfile;
  
  public List<NetStackInstanceProfile> getNetStackInstanceProfile() {
    if (this.netStackInstanceProfile == null)
      this.netStackInstanceProfile = new ArrayList<>(); 
    return this.netStackInstanceProfile;
  }
}
