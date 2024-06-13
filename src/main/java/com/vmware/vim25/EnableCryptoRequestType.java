package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyPlain;
import com.vmware.vim25.EnableCryptoRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "EnableCryptoRequestType", propOrder = {"_this", "keyPlain"})
public class EnableCryptoRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected CryptoKeyPlain keyPlain;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public CryptoKeyPlain getKeyPlain() {
    return this.keyPlain;
  }
  
  public void setKeyPlain(CryptoKeyPlain paramCryptoKeyPlain) {
    this.keyPlain = paramCryptoKeyPlain;
  }
}
