package com.vmware.vim25;

import com.vmware.vim25.AddKeysRequestType;
import com.vmware.vim25.CryptoKeyPlain;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AddKeysRequestType", propOrder = {"_this", "keys"})
public class AddKeysRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<CryptoKeyPlain> keys;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<CryptoKeyPlain> getKeys() {
    if (this.keys == null)
      this.keys = new ArrayList<>(); 
    return this.keys;
  }
}
