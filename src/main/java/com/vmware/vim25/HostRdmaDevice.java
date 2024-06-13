package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostRdmaDevice;
import com.vmware.vim25.HostRdmaDeviceBacking;
import com.vmware.vim25.HostRdmaDeviceCapability;
import com.vmware.vim25.HostRdmaDeviceConnectionInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRdmaDevice", propOrder = {"key", "device", "driver", "description", "backing", "connectionInfo", "capability"})
public class HostRdmaDevice extends DynamicData {
  @XmlElement(required = true)
  protected String key;
  
  @XmlElement(required = true)
  protected String device;
  
  protected String driver;
  
  protected String description;
  
  protected HostRdmaDeviceBacking backing;
  
  @XmlElement(required = true)
  protected HostRdmaDeviceConnectionInfo connectionInfo;
  
  @XmlElement(required = true)
  protected HostRdmaDeviceCapability capability;
  
  public String getKey() {
    return this.key;
  }
  
  public void setKey(String paramString) {
    this.key = paramString;
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public String getDriver() {
    return this.driver;
  }
  
  public void setDriver(String paramString) {
    this.driver = paramString;
  }
  
  public String getDescription() {
    return this.description;
  }
  
  public void setDescription(String paramString) {
    this.description = paramString;
  }
  
  public HostRdmaDeviceBacking getBacking() {
    return this.backing;
  }
  
  public void setBacking(HostRdmaDeviceBacking paramHostRdmaDeviceBacking) {
    this.backing = paramHostRdmaDeviceBacking;
  }
  
  public HostRdmaDeviceConnectionInfo getConnectionInfo() {
    return this.connectionInfo;
  }
  
  public void setConnectionInfo(HostRdmaDeviceConnectionInfo paramHostRdmaDeviceConnectionInfo) {
    this.connectionInfo = paramHostRdmaDeviceConnectionInfo;
  }
  
  public HostRdmaDeviceCapability getCapability() {
    return this.capability;
  }
  
  public void setCapability(HostRdmaDeviceCapability paramHostRdmaDeviceCapability) {
    this.capability = paramHostRdmaDeviceCapability;
  }
}
