package com.vmware.vim25;

import com.vmware.vim25.LicenseEvent;
import com.vmware.vim25.ServerLicenseExpiredEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServerLicenseExpiredEvent", propOrder = {"product"})
public class ServerLicenseExpiredEvent extends LicenseEvent {
  @XmlElement(required = true)
  protected String product;
  
  public String getProduct() {
    return this.product;
  }
  
  public void setProduct(String paramString) {
    this.product = paramString;
  }
}
