package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostVirtualSwitch;
import com.vmware.vim25.HostVirtualSwitch;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostVirtualSwitch", propOrder = {"hostVirtualSwitch"})
public class ArrayOfHostVirtualSwitch {
  @XmlElement(name = "HostVirtualSwitch")
  protected List<HostVirtualSwitch> hostVirtualSwitch;
  
  public List<HostVirtualSwitch> getHostVirtualSwitch() {
    if (this.hostVirtualSwitch == null)
      this.hostVirtualSwitch = new ArrayList<>(); 
    return this.hostVirtualSwitch;
  }
}
