package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostConfigInfoNetworkInfoPortConfig;
import com.vmware.vim25.VsanHostIpConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostConfigInfoNetworkInfoPortConfig", propOrder = {"ipConfig", "device"})
public class VsanHostConfigInfoNetworkInfoPortConfig extends DynamicData {
  protected VsanHostIpConfig ipConfig;
  
  @XmlElement(required = true)
  protected String device;
  
  public VsanHostIpConfig getIpConfig() {
    return this.ipConfig;
  }
  
  public void setIpConfig(VsanHostIpConfig paramVsanHostIpConfig) {
    this.ipConfig = paramVsanHostIpConfig;
  }
  
  public String getDevice() {
    return this.device;
  }
  
  public void setDevice(String paramString) {
    this.device = paramString;
  }
}
