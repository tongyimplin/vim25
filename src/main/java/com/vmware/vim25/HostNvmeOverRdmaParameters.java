package com.vmware.vim25;

import com.vmware.vim25.HostNvmeOverRdmaParameters;
import com.vmware.vim25.HostNvmeTransportParameters;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostNvmeOverRdmaParameters", propOrder = {"address", "addressFamily", "portNumber"})
public class HostNvmeOverRdmaParameters extends HostNvmeTransportParameters {
  @XmlElement(required = true)
  protected String address;
  
  protected String addressFamily;
  
  protected Integer portNumber;
  
  public String getAddress() {
    return this.address;
  }
  
  public void setAddress(String paramString) {
    this.address = paramString;
  }
  
  public String getAddressFamily() {
    return this.addressFamily;
  }
  
  public void setAddressFamily(String paramString) {
    this.addressFamily = paramString;
  }
  
  public Integer getPortNumber() {
    return this.portNumber;
  }
  
  public void setPortNumber(Integer paramInteger) {
    this.portNumber = paramInteger;
  }
}
