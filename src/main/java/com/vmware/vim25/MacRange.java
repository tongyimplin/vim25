package com.vmware.vim25;

import com.vmware.vim25.MacAddress;
import com.vmware.vim25.MacRange;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MacRange", propOrder = {"address", "mask"})
public class MacRange extends MacAddress {
  @XmlElement(required = true)
  protected String address;
  
  @XmlElement(required = true)
  protected String mask;
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String paramString) {
    this.address = paramString;
  }
  
  public String getMask() {
    return this.mask;
  }
  
  public void setMask(String paramString) {
    this.mask = paramString;
  }
}
