package com.vmware.vim25;

import com.vmware.vim25.GenerateCertificateSigningRequestRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateCertificateSigningRequestRequestType", propOrder = {"_this", "useIpAddressAsCommonName"})
public class GenerateCertificateSigningRequestRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected boolean useIpAddressAsCommonName;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public boolean isUseIpAddressAsCommonName() {
    return this.useIpAddressAsCommonName;
  }
  
  public void setUseIpAddressAsCommonName(boolean paramBoolean) {
    this.useIpAddressAsCommonName = paramBoolean;
  }
}
