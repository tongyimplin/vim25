package com.vmware.vim25;

import com.vmware.vim25.CustomizationFixedIpV6;
import com.vmware.vim25.CustomizationIpV6Generator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationFixedIpV6", propOrder = {"ipAddress", "subnetMask"})
public class CustomizationFixedIpV6 extends CustomizationIpV6Generator {
  @XmlElement(required = true)
  protected String ipAddress;
  
  protected int subnetMask;
  
  public String getIpAddress() {
    return this.ipAddress;
  }
  
  public void setIpAddress(String paramString) {
    this.ipAddress = paramString;
  }
  
  public int getSubnetMask() {
    return this.subnetMask;
  }
  
  public void setSubnetMask(int paramInt) {
    this.subnetMask = paramInt;
  }
}
