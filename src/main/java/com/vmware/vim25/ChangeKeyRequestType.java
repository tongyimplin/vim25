package com.vmware.vim25;

import com.vmware.vim25.ChangeKeyRequestType;
import com.vmware.vim25.CryptoKeyPlain;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeKeyRequestType", propOrder = {"_this", "newKey"})
public class ChangeKeyRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected CryptoKeyPlain newKey;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public CryptoKeyPlain getNewKey() {
    return this.newKey;
  }
  
  public void setNewKey(CryptoKeyPlain paramCryptoKeyPlain) {
    this.newKey = paramCryptoKeyPlain;
  }
}
