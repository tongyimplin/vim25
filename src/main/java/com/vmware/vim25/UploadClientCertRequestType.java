package com.vmware.vim25;

import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UploadClientCertRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadClientCertRequestType", propOrder = {"_this", "cluster", "certificate", "privateKey"})
public class UploadClientCertRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected KeyProviderId cluster;
  
  @XmlElement(required = true)
  protected String certificate;
  
  @XmlElement(required = true)
  protected String privateKey;
  
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
  
  public String getPrivateKey() {
    return this.privateKey;
  }
  
  public void setPrivateKey(String paramString) {
    this.privateKey = paramString;
  }
}
