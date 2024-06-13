package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostOpaqueSwitch;
import com.vmware.vim25.HostOpaqueSwitch;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostOpaqueSwitch", propOrder = {"hostOpaqueSwitch"})
public class ArrayOfHostOpaqueSwitch {
  @XmlElement(name = "HostOpaqueSwitch")
  protected List<HostOpaqueSwitch> hostOpaqueSwitch;
  
  public List<HostOpaqueSwitch> getHostOpaqueSwitch() {
    if (this.hostOpaqueSwitch == null)
      this.hostOpaqueSwitch = new ArrayList<>(); 
    return this.hostOpaqueSwitch;
  }
}
