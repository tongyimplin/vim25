package com.vmware.vim25;

import com.vmware.vim25.DeviceHotPlugNotSupported;
import com.vmware.vim25.DeviceNotFound;
import com.vmware.vim25.DeviceUnsupportedForVmPlatform;
import com.vmware.vim25.DeviceUnsupportedForVmVersion;
import com.vmware.vim25.DisallowedDiskModeChange;
import com.vmware.vim25.InvalidController;
import com.vmware.vim25.InvalidDeviceBacking;
import com.vmware.vim25.InvalidDeviceOperation;
import com.vmware.vim25.InvalidDeviceSpec;
import com.vmware.vim25.InvalidVmConfig;
import com.vmware.vim25.MissingController;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidDeviceSpec", propOrder = {"deviceIndex"})
@XmlSeeAlso({InvalidController.class, DisallowedDiskModeChange.class, DeviceUnsupportedForVmVersion.class, DeviceHotPlugNotSupported.class, InvalidDeviceBacking.class, DeviceNotFound.class, MissingController.class, DeviceUnsupportedForVmPlatform.class, InvalidDeviceOperation.class})
public class InvalidDeviceSpec extends InvalidVmConfig {
  protected int deviceIndex;
  
  public int getDeviceIndex() {
    return this.deviceIndex;
  }
  
  public void setDeviceIndex(int paramInt) {
    this.deviceIndex = paramInt;
  }
}
