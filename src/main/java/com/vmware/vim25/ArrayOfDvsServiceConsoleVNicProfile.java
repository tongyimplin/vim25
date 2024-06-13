package com.vmware.vim25;

import com.vmware.vim25.ArrayOfDvsServiceConsoleVNicProfile;
import com.vmware.vim25.DvsServiceConsoleVNicProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDvsServiceConsoleVNicProfile", propOrder = {"dvsServiceConsoleVNicProfile"})
public class ArrayOfDvsServiceConsoleVNicProfile {
  @XmlElement(name = "DvsServiceConsoleVNicProfile")
  protected List<DvsServiceConsoleVNicProfile> dvsServiceConsoleVNicProfile;
  
  public List<DvsServiceConsoleVNicProfile> getDvsServiceConsoleVNicProfile() {
    if (this.dvsServiceConsoleVNicProfile == null)
      this.dvsServiceConsoleVNicProfile = new ArrayList<>(); 
    return this.dvsServiceConsoleVNicProfile;
  }
}
