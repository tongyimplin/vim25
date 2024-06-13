package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyPlain;
import com.vmware.vim25.CryptoManagerHostEnableRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoManagerHostEnableRequestType", propOrder = {"_this", "initialKey"})
public class CryptoManagerHostEnableRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected CryptoKeyPlain initialKey;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public CryptoKeyPlain getInitialKey() {
    return this.initialKey;
  }
  
  public void setInitialKey(CryptoKeyPlain paramCryptoKeyPlain) {
    this.initialKey = paramCryptoKeyPlain;
  }
}
