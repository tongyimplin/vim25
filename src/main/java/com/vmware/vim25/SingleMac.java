package com.vmware.vim25;

import com.vmware.vim25.MacAddress;
import com.vmware.vim25.SingleMac;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleMac", propOrder = {"address"})
public class SingleMac extends MacAddress {
  @XmlElement(required = true)
  protected String address;
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String paramString) {
    this.address = paramString;
  }
}
