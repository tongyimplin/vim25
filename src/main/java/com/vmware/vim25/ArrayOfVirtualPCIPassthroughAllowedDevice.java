package com.vmware.vim25;

import com.vmware.vim25.ArrayOfVirtualPCIPassthroughAllowedDevice;
import com.vmware.vim25.VirtualPCIPassthroughAllowedDevice;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfVirtualPCIPassthroughAllowedDevice", propOrder = {"virtualPCIPassthroughAllowedDevice"})
public class ArrayOfVirtualPCIPassthroughAllowedDevice {
  @XmlElement(name = "VirtualPCIPassthroughAllowedDevice")
  protected List<VirtualPCIPassthroughAllowedDevice> virtualPCIPassthroughAllowedDevice;
  
  public List<VirtualPCIPassthroughAllowedDevice> getVirtualPCIPassthroughAllowedDevice() {
    if (this.virtualPCIPassthroughAllowedDevice == null)
      this.virtualPCIPassthroughAllowedDevice = new ArrayList<>(); 
    return this.virtualPCIPassthroughAllowedDevice;
  }
}
