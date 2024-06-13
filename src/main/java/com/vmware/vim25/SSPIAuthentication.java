package com.vmware.vim25;

import com.vmware.vim25.GuestAuthentication;
import com.vmware.vim25.SSPIAuthentication;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SSPIAuthentication", propOrder = {"sspiToken"})
public class SSPIAuthentication extends GuestAuthentication {
  @XmlElement(required = true)
  protected String sspiToken;
  
  public String getSspiToken() {
    return this.sspiToken;
  }
  
  public void setSspiToken(String paramString) {
    this.sspiToken = paramString;
  }
}
