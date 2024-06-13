package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.SetExtensionCertificateRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SetExtensionCertificateRequestType", propOrder = {"_this", "extensionKey", "certificatePem"})
public class SetExtensionCertificateRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String extensionKey;
  
  protected String certificatePem;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getExtensionKey() {
    return this.extensionKey;
  }
  
  public void setExtensionKey(String paramString) {
    this.extensionKey = paramString;
  }
  
  public String getCertificatePem() {
    return this.certificatePem;
  }
  
  public void setCertificatePem(String paramString) {
    this.certificatePem = paramString;
  }
}
