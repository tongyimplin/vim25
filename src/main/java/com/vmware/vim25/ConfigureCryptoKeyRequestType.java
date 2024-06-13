package com.vmware.vim25;

import com.vmware.vim25.ConfigureCryptoKeyRequestType;
import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ConfigureCryptoKeyRequestType", propOrder = {"_this", "keyId"})
public class ConfigureCryptoKeyRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected CryptoKeyId keyId;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public CryptoKeyId getKeyId() {
    return this.keyId;
  }
  
  public void setKeyId(CryptoKeyId paramCryptoKeyId) {
    this.keyId = paramCryptoKeyId;
  }
}
