package com.vmware.vim25;

import com.vmware.vim25.VirtualDeviceBackingInfo;
import com.vmware.vim25.VirtualDeviceURIBackingInfo;
import com.vmware.vim25.VirtualSerialPortURIBackingInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceURIBackingInfo", propOrder = {"serviceURI", "direction", "proxyURI"})
@XmlSeeAlso({VirtualSerialPortURIBackingInfo.class})
public class VirtualDeviceURIBackingInfo extends VirtualDeviceBackingInfo {
  @XmlElement(required = true)
  protected String serviceURI;
  
  @XmlElement(required = true)
  protected String direction;
  
  protected String proxyURI;
  
  public String getServiceURI() {
    return this.serviceURI;
  }
  
  public void setServiceURI(String paramString) {
    this.serviceURI = paramString;
  }
  
  public String getDirection() {
    return this.direction;
  }
  
  public void setDirection(String paramString) {
    this.direction = paramString;
  }
  
  public String getProxyURI() {
    return this.proxyURI;
  }
  
  public void setProxyURI(String paramString) {
    this.proxyURI = paramString;
  }
}
