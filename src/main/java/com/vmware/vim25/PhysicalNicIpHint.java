package com.vmware.vim25;

import com.vmware.vim25.PhysicalNicHint;
import com.vmware.vim25.PhysicalNicIpHint;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PhysicalNicIpHint", propOrder = {"ipSubnet"})
public class PhysicalNicIpHint extends PhysicalNicHint {
  @XmlElement(required = true)
  protected String ipSubnet;
  
  public String getIpSubnet() {
    return this.ipSubnet;
  }
  
  public void setIpSubnet(String paramString) {
    this.ipSubnet = paramString;
  }
}
