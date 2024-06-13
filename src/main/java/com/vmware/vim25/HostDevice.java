package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostDevice;
import com.vmware.vim25.ScsiLun;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostDevice", propOrder = {"deviceName", "deviceType"})
@XmlSeeAlso({ScsiLun.class})
public class HostDevice extends DynamicData {
  @XmlElement(required = true)
  protected String deviceName;
  
  @XmlElement(required = true)
  protected String deviceType;
  
  public String getDeviceName() {
    return this.deviceName;
  }
  
  public void setDeviceName(String paramString) {
    this.deviceName = paramString;
  }
  
  public String getDeviceType() {
    return this.deviceType;
  }
  
  public void setDeviceType(String paramString) {
    this.deviceType = paramString;
  }
}
