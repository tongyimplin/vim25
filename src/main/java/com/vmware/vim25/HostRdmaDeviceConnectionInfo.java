package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostRdmaDeviceConnectionInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRdmaDeviceConnectionInfo", propOrder = {"state", "mtu", "speedInMbps"})
public class HostRdmaDeviceConnectionInfo extends DynamicData {
  @XmlElement(required = true)
  protected String state;
  
  protected int mtu;
  
  protected int speedInMbps;
  
  public String getState() {
    return this.state;
  }
  
  public void setState(String paramString) {
    this.state = paramString;
  }
  
  public int getMtu() {
    return this.mtu;
  }
  
  public void setMtu(int paramInt) {
    this.mtu = paramInt;
  }
  
  public int getSpeedInMbps() {
    return this.speedInMbps;
  }
  
  public void setSpeedInMbps(int paramInt) {
    this.speedInMbps = paramInt;
  }
}
