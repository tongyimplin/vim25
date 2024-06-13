package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.CryptoSpec;
import com.vmware.vim25.CryptoSpecShallowRecrypt;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoSpecShallowRecrypt", propOrder = {"newKeyId"})
public class CryptoSpecShallowRecrypt extends CryptoSpec {
  @XmlElement(required = true)
  protected CryptoKeyId newKeyId;
  
  public CryptoKeyId getNewKeyId() {
    return this.newKeyId;
  }
  
  public void setNewKeyId(CryptoKeyId paramCryptoKeyId) {
    this.newKeyId = paramCryptoKeyId;
  }
}
