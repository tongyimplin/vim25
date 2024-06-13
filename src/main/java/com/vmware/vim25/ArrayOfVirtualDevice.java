package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualDevice;
import com.vmware.vim25.VirtualDevice;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualDevice", propOrder = {"virtualDevice"})
public class ArrayOfVirtualDevice {
  @XmlElement(name = "VirtualDevice")
  protected List<VirtualDevice> virtualDevice;
  
  public List<VirtualDevice> getVirtualDevice() {
    if (this.virtualDevice == null)
      this.virtualDevice = new ArrayList<>(); 
    return this.virtualDevice;
  }
}
