package com.vmware.vim25;

import com.vmware.vim25.DeviceUnsupportedForVmVersion;
import com.vmware.vim25.DeviceUnsupportedForVmVersionFaultMsg;
import javax.xml.ws.WebFault;

@WebFault(name = "DeviceUnsupportedForVmVersionFault", targetNamespace = "urn:vim25")
public class DeviceUnsupportedForVmVersionFaultMsg extends Exception {
  private DeviceUnsupportedForVmVersion faultInfo;
  
  public DeviceUnsupportedForVmVersionFaultMsg(String paramString, DeviceUnsupportedForVmVersion paramDeviceUnsupportedForVmVersion) {
    super(paramString);
    this.faultInfo = paramDeviceUnsupportedForVmVersion;
  }
  
  public DeviceUnsupportedForVmVersionFaultMsg(String paramString, DeviceUnsupportedForVmVersion paramDeviceUnsupportedForVmVersion, Throwable paramThrowable) {
    super(paramString, paramThrowable);
    this.faultInfo = paramDeviceUnsupportedForVmVersion;
  }
  
  public DeviceUnsupportedForVmVersion getFaultInfo() {
    return this.faultInfo;
  }
}
