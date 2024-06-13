package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostOpaqueSwitchPhysicalNicZone;
import com.vmware.vim25.HostOpaqueSwitchPhysicalNicZone;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostOpaqueSwitchPhysicalNicZone", propOrder = {"hostOpaqueSwitchPhysicalNicZone"})
public class ArrayOfHostOpaqueSwitchPhysicalNicZone {
  @XmlElement(name = "HostOpaqueSwitchPhysicalNicZone")
  protected List<HostOpaqueSwitchPhysicalNicZone> hostOpaqueSwitchPhysicalNicZone;
  
  public List<HostOpaqueSwitchPhysicalNicZone> getHostOpaqueSwitchPhysicalNicZone() {
    if (this.hostOpaqueSwitchPhysicalNicZone == null)
      this.hostOpaqueSwitchPhysicalNicZone = new ArrayList<>(); 
    return this.hostOpaqueSwitchPhysicalNicZone;
  }
}
