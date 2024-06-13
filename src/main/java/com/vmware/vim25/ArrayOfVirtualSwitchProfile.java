package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualSwitchProfile;
import com.vmware.vim25.VirtualSwitchProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualSwitchProfile", propOrder = {"virtualSwitchProfile"})
public class ArrayOfVirtualSwitchProfile {
  @XmlElement(name = "VirtualSwitchProfile")
  protected List<VirtualSwitchProfile> virtualSwitchProfile;
  
  public List<VirtualSwitchProfile> getVirtualSwitchProfile() {
    if (this.virtualSwitchProfile == null)
      this.virtualSwitchProfile = new ArrayList<>(); 
    return this.virtualSwitchProfile;
  }
}
