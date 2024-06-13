package com.vmware.vim25;

import com.vmware.vim25.HostFibreChannelOverEthernetTargetTransport;
import com.vmware.vim25.HostFibreChannelTargetTransport;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostFibreChannelOverEthernetTargetTransport", propOrder = {"vnportMac", "fcfMac", "vlanId"})
public class HostFibreChannelOverEthernetTargetTransport extends HostFibreChannelTargetTransport {
  @XmlElement(required = true)
  protected String vnportMac;
  
  @XmlElement(required = true)
  protected String fcfMac;
  
  protected int vlanId;
  
  public String getVnportMac() {
    return this.vnportMac;
  }
  
  public void setVnportMac(String paramString) {
    this.vnportMac = paramString;
  }
  
  public String getFcfMac() {
    return this.fcfMac;
  }
  
  public void setFcfMac(String paramString) {
    this.fcfMac = paramString;
  }
  
  public int getVlanId() {
    return this.vlanId;
  }
  
  public void setVlanId(int paramInt) {
    this.vlanId = paramInt;
  }
}
