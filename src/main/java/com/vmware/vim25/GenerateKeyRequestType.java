package com.vmware.vim25;

import com.vmware.vim25.GenerateKeyRequestType;
import com.vmware.vim25.KeyProviderId;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GenerateKeyRequestType", propOrder = {"_this", "keyProvider"})
public class GenerateKeyRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected KeyProviderId keyProvider;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public KeyProviderId getKeyProvider() {
    return this.keyProvider;
  }
  
  public void setKeyProvider(KeyProviderId paramKeyProviderId) {
    this.keyProvider = paramKeyProviderId;
  }
}
