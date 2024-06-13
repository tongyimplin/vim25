package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostInternetScsiHbaIscsiIpv6Address;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostInternetScsiHbaIscsiIpv6Address", propOrder = {"address", "prefixLength", "origin", "operation"})
public class HostInternetScsiHbaIscsiIpv6Address extends DynamicData {
  @XmlElement(required = true)
  protected String address;
  
  protected int prefixLength;
  
  @XmlElement(required = true)
  protected String origin;
  
  protected String operation;
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String paramString) {
    this.address = paramString;
  }
  
  public int getPrefixLength() {
    return this.prefixLength;
  }
  
  public void setPrefixLength(int paramInt) {
    this.prefixLength = paramInt;
  }
  
  public String getOrigin() {
    return this.origin;
  }
  
  public void setOrigin(String paramString) {
    this.origin = paramString;
  }
  
  public String getOperation() {
    return this.operation;
  }
  
  public void setOperation(String paramString) {
    this.operation = paramString;
  }
}
