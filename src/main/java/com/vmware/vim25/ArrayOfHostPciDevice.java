package com.vmware.vim25;

import com.vmware.vim25.ArrayOfHostPciDevice;
import com.vmware.vim25.HostPciDevice;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfHostPciDevice", propOrder = {"hostPciDevice"})
public class ArrayOfHostPciDevice {
  @XmlElement(name = "HostPciDevice")
  protected List<HostPciDevice> hostPciDevice;
  
  public List<HostPciDevice> getHostPciDevice() {
    if (this.hostPciDevice == null)
      this.hostPciDevice = new ArrayList<>(); 
    return this.hostPciDevice;
  }
}
