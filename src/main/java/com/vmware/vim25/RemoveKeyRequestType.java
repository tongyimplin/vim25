package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveKeyRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveKeyRequestType", propOrder = {"_this", "key", "force"})
public class RemoveKeyRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected CryptoKeyId key;
  
  protected boolean force;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public CryptoKeyId getKey() {
    return this.key;
  }
  
  public void setKey(CryptoKeyId paramCryptoKeyId) {
    this.key = paramCryptoKeyId;
  }
  
  public boolean isForce() {
    return this.force;
  }
  
  public void setForce(boolean paramBoolean) {
    this.force = paramBoolean;
  }
}
