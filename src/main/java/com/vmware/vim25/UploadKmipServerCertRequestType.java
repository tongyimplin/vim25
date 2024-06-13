package com.vmware.vim25;

import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UploadKmipServerCertRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadKmipServerCertRequestType", propOrder = {"_this", "cluster", "certificate"})
public class UploadKmipServerCertRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected KeyProviderId cluster;
  
  @XmlElement(required = true)
  protected String certificate;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public KeyProviderId getCluster() {
    return this.cluster;
  }
  
  public void setCluster(KeyProviderId paramKeyProviderId) {
    this.cluster = paramKeyProviderId;
  }
  
  public String getCertificate() {
    return this.certificate;
  }
  
  public void setCertificate(String paramString) {
    this.certificate = paramString;
  }
}
