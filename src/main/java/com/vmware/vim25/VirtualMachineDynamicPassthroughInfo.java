package com.vmware.vim25;

import com.vmware.vim25.VirtualMachineDynamicPassthroughInfo;
import com.vmware.vim25.VirtualMachineTargetInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineDynamicPassthroughInfo", propOrder = {"vendorName", "deviceName", "customLabel", "vendorId", "deviceId"})
public class VirtualMachineDynamicPassthroughInfo extends VirtualMachineTargetInfo {
  @XmlElement(required = true)
  protected String vendorName;
  
  @XmlElement(required = true)
  protected String deviceName;
  
  protected String customLabel;
  
  protected int vendorId;
  
  protected int deviceId;
  
  public String getVendorName() {
    return this.vendorName;
  }
  
  public void setVendorName(String paramString) {
    this.vendorName = paramString;
  }
  
  public String getDeviceName() {
    return this.deviceName;
  }
  
  public void setDeviceName(String paramString) {
    this.deviceName = paramString;
  }
  
  public String getCustomLabel() {
    return this.customLabel;
  }
  
  public void setCustomLabel(String paramString) {
    this.customLabel = paramString;
  }
  
  public int getVendorId() {
    return this.vendorId;
  }
  
  public void setVendorId(int paramInt) {
    this.vendorId = paramInt;
  }
  
  public int getDeviceId() {
    return this.deviceId;
  }
  
  public void setDeviceId(int paramInt) {
    this.deviceId = paramInt;
  }
}
