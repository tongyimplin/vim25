package com.vmware.vim25;

import com.vmware.vim25.GenerateCertificateSigningRequestByDnRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateCertificateSigningRequestByDnRequestType", propOrder = {"_this", "distinguishedName"})
public class GenerateCertificateSigningRequestByDnRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String distinguishedName;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getDistinguishedName() {
    return this.distinguishedName;
  }
  
  public void setDistinguishedName(String paramString) {
    this.distinguishedName = paramString;
  }
}
