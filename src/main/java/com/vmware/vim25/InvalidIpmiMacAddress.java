package com.vmware.vim25;

import com.vmware.vim25.InvalidIpmiMacAddress;
import com.vmware.vim25.VimFault;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InvalidIpmiMacAddress", propOrder = {"userProvidedMacAddress", "observedMacAddress"})
public class InvalidIpmiMacAddress extends VimFault {
  @XmlElement(required = true)
  protected String userProvidedMacAddress;
  
  @XmlElement(required = true)
  protected String observedMacAddress;
  
  public String getUserProvidedMacAddress() {
    return this.userProvidedMacAddress;
  }
  
  public void setUserProvidedMacAddress(String paramString) {
    this.userProvidedMacAddress = paramString;
  }
  
  public String getObservedMacAddress() {
    return this.observedMacAddress;
  }
  
  public void setObservedMacAddress(String paramString) {
    this.observedMacAddress = paramString;
  }
}
