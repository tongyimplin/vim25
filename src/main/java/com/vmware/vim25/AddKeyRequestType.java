package com.vmware.vim25;

import com.vmware.vim25.AddKeyRequestType;
import com.vmware.vim25.CryptoKeyPlain;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddKeyRequestType", propOrder = {"_this", "key"})
public class AddKeyRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected CryptoKeyPlain key;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public CryptoKeyPlain getKey() {
    return this.key;
  }
  
  public void setKey(CryptoKeyPlain paramCryptoKeyPlain) {
    this.key = paramCryptoKeyPlain;
  }
}
