package com.vmware.vim25;

import com.vmware.vim25.CustomizationIPSettingsIpV6AddressSpec;
import com.vmware.vim25.CustomizationIpV6Generator;
import com.vmware.vim25.DynamicData;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomizationIPSettingsIpV6AddressSpec", propOrder = {"ip", "gateway"})
public class CustomizationIPSettingsIpV6AddressSpec extends DynamicData {
  @XmlElement(required = true)
  protected List<CustomizationIpV6Generator> ip;
  
  protected List<String> gateway;
  
  public List<CustomizationIpV6Generator> getIp() {
    if (this.ip == null)
      this.ip = new ArrayList<>(); 
    return this.ip;
  }
  
  public List<String> getGateway() {
    if (this.gateway == null)
      this.gateway = new ArrayList<>(); 
    return this.gateway;
  }
}
