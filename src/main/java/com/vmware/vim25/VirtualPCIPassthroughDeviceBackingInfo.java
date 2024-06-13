package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceDeviceBackingInfo;
import com.vmware.vim25.VirtualPCIPassthroughDeviceBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualPCIPassthroughDeviceBackingInfo", propOrder = {"id", "deviceId", "systemId", "vendorId"})
public class VirtualPCIPassthroughDeviceBackingInfo extends VirtualDeviceDeviceBackingInfo {
  @XmlElement(required = true)
  protected String id;
  
  @XmlElement(required = true)
  protected String deviceId;
  
  @XmlElement(required = true)
  protected String systemId;
  
  protected short vendorId;
  
  public String getId() {
    return this.id;
  }
  
  public void setId(String paramString) {
    this.id = paramString;
  }
  
  public String getDeviceId() {
    return this.deviceId;
  }
  
  public void setDeviceId(String paramString) {
    this.deviceId = paramString;
  }
  
  public String getSystemId() {
    return this.systemId;
  }
  
  public void setSystemId(String paramString) {
    this.systemId = paramString;
  }
  
  public short getVendorId() {
    return this.vendorId;
  }
  
  public void setVendorId(short paramShort) {
    this.vendorId = paramShort;
  }
}
