package com.vmware.vim25;

import com.vmware.vim25.IpAddress;
import com.vmware.vim25.SingleIp;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SingleIp", propOrder = {"address"})
public class SingleIp extends IpAddress {
  @XmlElement(required = true)
  protected String address;
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String paramString) {
    this.address = paramString;
  }
}
