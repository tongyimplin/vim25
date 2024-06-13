package com.vmware.vim25;

import com.vmware.vim25.ChoiceOption;
import com.vmware.vim25.VirtualDeviceDeviceBackingOption;
import com.vmware.vim25.VirtualPointingDeviceBackingOption;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPointingDeviceBackingOption", propOrder = {"hostPointingDevice"})
public class VirtualPointingDeviceBackingOption extends VirtualDeviceDeviceBackingOption {
  @XmlElement(required = true)
  protected ChoiceOption hostPointingDevice;
  
  public ChoiceOption getHostPointingDevice() {
    return this.hostPointingDevice;
  }
  
  public void setHostPointingDevice(ChoiceOption paramChoiceOption) {
    this.hostPointingDevice = paramChoiceOption;
  }
}
