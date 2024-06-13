package com.vmware.vim25;

import com.vmware.vim25.VirtualMachinePciPassthroughInfo;
import com.vmware.vim25.VirtualMachineSriovDevicePoolInfo;
import com.vmware.vim25.VirtualMachineSriovInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineSriovInfo", propOrder = {"virtualFunction", "pnic", "devicePool"})
public class VirtualMachineSriovInfo extends VirtualMachinePciPassthroughInfo {
  protected boolean virtualFunction;
  
  protected String pnic;
  
  protected VirtualMachineSriovDevicePoolInfo devicePool;
  
  public boolean isVirtualFunction() {
    return this.virtualFunction;
  }
  
  public void setVirtualFunction(boolean paramBoolean) {
    this.virtualFunction = paramBoolean;
  }
  
  public String getPnic() {
    return this.pnic;
  }
  
  public void setPnic(String paramString) {
    this.pnic = paramString;
  }
  
  public VirtualMachineSriovDevicePoolInfo getDevicePool() {
    return this.devicePool;
  }
  
  public void setDevicePool(VirtualMachineSriovDevicePoolInfo paramVirtualMachineSriovDevicePoolInfo) {
    this.devicePool = paramVirtualMachineSriovDevicePoolInfo;
  }
}
