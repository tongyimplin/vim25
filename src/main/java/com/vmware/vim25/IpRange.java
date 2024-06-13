package com.vmware.vim25;

import com.vmware.vim25.IpAddress;
import com.vmware.vim25.IpRange;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IpRange", propOrder = {"addressPrefix", "prefixLength"})
public class IpRange extends IpAddress {
  @XmlElement(required = true)
  protected String addressPrefix;
  
  protected Integer prefixLength;
  
  public String getAddressPrefix() {
    return this.addressPrefix;
  }
  
  public void setAddressPrefix(String paramString) {
    this.addressPrefix = paramString;
  }
  
  public Integer getPrefixLength() {
    return this.prefixLength;
  }
  
  public void setPrefixLength(Integer paramInteger) {
    this.prefixLength = paramInteger;
  }
}
