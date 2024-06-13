package com.vmware.vim25;

import com.vmware.vim25.AcquireCredentialsInGuestResponse;
import com.vmware.vim25.GuestAuthentication;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "AcquireCredentialsInGuestResponse")
public class AcquireCredentialsInGuestResponse {
  @XmlElement(required = true)
  protected GuestAuthentication returnval;
  
  public GuestAuthentication getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(GuestAuthentication paramGuestAuthentication) {
    this.returnval = paramGuestAuthentication;
  }
}
