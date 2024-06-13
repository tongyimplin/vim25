package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineSriovDevicePoolInfo;
import com.vmware.vim25.VirtualMachineSriovNetworkDevicePoolInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSriovNetworkDevicePoolInfo", propOrder = {"switchKey", "switchUuid"})
public class VirtualMachineSriovNetworkDevicePoolInfo extends VirtualMachineSriovDevicePoolInfo {
  protected String switchKey;
  
  protected String switchUuid;
  
  public String getSwitchKey() {
    return this.switchKey;
  }
  
  public void setSwitchKey(String paramString) {
    this.switchKey = paramString;
  }
  
  public String getSwitchUuid() {
    return this.switchUuid;
  }
  
  public void setSwitchUuid(String paramString) {
    this.switchUuid = paramString;
  }
}
