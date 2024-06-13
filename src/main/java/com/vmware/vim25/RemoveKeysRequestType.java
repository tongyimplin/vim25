package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveKeysRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveKeysRequestType", propOrder = {"_this", "keys", "force"})
public class RemoveKeysRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<CryptoKeyId> keys;
  
  protected boolean force;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<CryptoKeyId> getKeys() {
    if (this.keys == null)
      this.keys = new ArrayList<>(); 
    return this.keys;
  }
  
  public boolean isForce() {
    return this.force;
  }
  
  public void setForce(boolean paramBoolean) {
    this.force = paramBoolean;
  }
}
