package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryCryptoKeyStatusRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCryptoKeyStatusRequestType", propOrder = {"_this", "keyIds", "checkKeyBitMap"})
public class QueryCryptoKeyStatusRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<CryptoKeyId> keyIds;
  
  protected int checkKeyBitMap;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<CryptoKeyId> getKeyIds() {
    if (this.keyIds == null)
      this.keyIds = new ArrayList<>(); 
    return this.keyIds;
  }
  
  public int getCheckKeyBitMap() {
    return this.checkKeyBitMap;
  }
  
  public void setCheckKeyBitMap(int paramInt) {
    this.checkKeyBitMap = paramInt;
  }
}
