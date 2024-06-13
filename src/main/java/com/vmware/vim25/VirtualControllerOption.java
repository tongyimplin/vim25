package com.vmware.vim25;

import com.vmware.vim25.IntOption;
import com.vmware.vim25.VirtualControllerOption;
import com.vmware.vim25.VirtualDeviceOption;
import com.vmware.vim25.VirtualIDEControllerOption;
import com.vmware.vim25.VirtualNVDIMMControllerOption;
import com.vmware.vim25.VirtualNVMEControllerOption;
import com.vmware.vim25.VirtualPCIControllerOption;
import com.vmware.vim25.VirtualPS2ControllerOption;
import com.vmware.vim25.VirtualSATAControllerOption;
import com.vmware.vim25.VirtualSCSIControllerOption;
import com.vmware.vim25.VirtualSIOControllerOption;
import com.vmware.vim25.VirtualUSBControllerOption;
import com.vmware.vim25.VirtualUSBXHCIControllerOption;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualControllerOption", propOrder = {"devices", "supportedDevice"})
@XmlSeeAlso({VirtualNVDIMMControllerOption.class, VirtualUSBControllerOption.class, VirtualSATAControllerOption.class, VirtualPS2ControllerOption.class, VirtualPCIControllerOption.class, VirtualSIOControllerOption.class, VirtualIDEControllerOption.class, VirtualNVMEControllerOption.class, VirtualSCSIControllerOption.class, VirtualUSBXHCIControllerOption.class})
public class VirtualControllerOption extends VirtualDeviceOption {
  @XmlElement(required = true)
  protected IntOption devices;
  
  protected List<String> supportedDevice;
  
  public IntOption getDevices() {
    return this.devices;
  }
  
  public void setDevices(IntOption paramIntOption) {
    this.devices = paramIntOption;
  }
  
  public List<String> getSupportedDevice() {
    if (this.supportedDevice == null)
      this.supportedDevice = new ArrayList<>(); 
    return this.supportedDevice;
  }
}
