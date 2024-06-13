package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VsanHostIpConfig;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VsanHostIpConfig", propOrder = {"upstreamIpAddress", "downstreamIpAddress"})
public class VsanHostIpConfig extends DynamicData {
  @XmlElement(required = true)
  protected String upstreamIpAddress;
  
  @XmlElement(required = true)
  protected String downstreamIpAddress;
  
  public String getUpstreamIpAddress() {
    return this.upstreamIpAddress;
  }
  
  public void setUpstreamIpAddress(String paramString) {
    this.upstreamIpAddress = paramString;
  }
  
  public String getDownstreamIpAddress() {
    return this.downstreamIpAddress;
  }
  
  public void setDownstreamIpAddress(String paramString) {
    this.downstreamIpAddress = paramString;
  }
}
