package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostAssignableHardwareConfigAttributeOverride;
import com.vmware.vim25.HostAssignableHardwareConfigAttributeOverride;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostAssignableHardwareConfigAttributeOverride", propOrder = {"hostAssignableHardwareConfigAttributeOverride"})
public class ArrayOfHostAssignableHardwareConfigAttributeOverride {
  @XmlElement(name = "HostAssignableHardwareConfigAttributeOverride")
  protected List<HostAssignableHardwareConfigAttributeOverride> hostAssignableHardwareConfigAttributeOverride;
  
  public List<HostAssignableHardwareConfigAttributeOverride> getHostAssignableHardwareConfigAttributeOverride() {
    if (this.hostAssignableHardwareConfigAttributeOverride == null)
      this.hostAssignableHardwareConfigAttributeOverride = new ArrayList<>(); 
    return this.hostAssignableHardwareConfigAttributeOverride;
  }
}
