package com.vmware.vim25;

import com.vmware.vim25.CustomizationFixedIp;
import com.vmware.vim25.CustomizationIpGenerator;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationFixedIp", propOrder = {"ipAddress"})
public class CustomizationFixedIp extends CustomizationIpGenerator {
  @XmlElement(required = true)
  protected String ipAddress;
  
  public String getIpAddress() {
    return this.ipAddress;
  }
  
  public void setIpAddress(String paramString) {
    this.ipAddress = paramString;
  }
}
