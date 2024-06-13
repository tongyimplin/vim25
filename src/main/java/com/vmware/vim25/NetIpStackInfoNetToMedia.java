package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.NetIpStackInfoNetToMedia;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NetIpStackInfoNetToMedia", propOrder = {"ipAddress", "physicalAddress", "device", "type"})
public class NetIpStackInfoNetToMedia extends DynamicData {
  @XmlElement(required = true)
  protected String ipAddress;
  
  @XmlElement(required = true)
  protected String physicalAddress;
  
  @XmlElement(required = true)
  protected String device;
  
  @XmlElement(required = true)
  protected String type;
  
  public String getIpAddress() {
    return this.ipAddress;
  }
  
  public void setIpAddress(String paramString) {
    this.ipAddress = paramString;
  }
  
  public String getPhysicalAddress() {
    return this.physicalAddress;
  }
  
  public void setPhysicalAddress(String paramString) {
    this.physicalAddress = paramString;
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
  
  public String getType() {
    return this.type;
  }
  
  public void setType(String paramString) {
    this.type = paramString;
  }
}
