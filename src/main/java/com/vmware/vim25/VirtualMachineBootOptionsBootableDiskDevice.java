package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineBootOptionsBootableDevice;
import com.vmware.vim25.VirtualMachineBootOptionsBootableDiskDevice;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineBootOptionsBootableDiskDevice", propOrder = {"deviceKey"})
public class VirtualMachineBootOptionsBootableDiskDevice extends VirtualMachineBootOptionsBootableDevice {
  protected int deviceKey;
  
  public int getDeviceKey() {
    return this.deviceKey;
  }
  
  public void setDeviceKey(int paramInt) {
    this.deviceKey = paramInt;
  }
}
