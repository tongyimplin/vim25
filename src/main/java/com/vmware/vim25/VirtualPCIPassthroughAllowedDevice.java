package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualPCIPassthroughAllowedDevice;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCIPassthroughAllowedDevice", propOrder = {"vendorId", "deviceId", "subVendorId", "subDeviceId", "revisionId"})
public class VirtualPCIPassthroughAllowedDevice extends DynamicData {
  protected int vendorId;
  
  protected int deviceId;
  
  protected Integer subVendorId;
  
  protected Integer subDeviceId;
  
  protected Short revisionId;
  
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
  
  public Integer getSubVendorId() {
    return this.subVendorId;
  }
  
  public void setSubVendorId(Integer paramInteger) {
    this.subVendorId = paramInteger;
  }
  
  public Integer getSubDeviceId() {
    return this.subDeviceId;
  }
  
  public void setSubDeviceId(Integer paramInteger) {
    this.subDeviceId = paramInteger;
  }
  
  public Short getRevisionId() {
    return this.revisionId;
  }
  
  public void setRevisionId(Short paramShort) {
    this.revisionId = paramShort;
  }
}
