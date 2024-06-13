package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.CryptoSpec;
import com.vmware.vim25.CryptoSpecEncrypt;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoSpecEncrypt", propOrder = {"cryptoKeyId"})
public class CryptoSpecEncrypt extends CryptoSpec {
  @XmlElement(required = true)
  protected CryptoKeyId cryptoKeyId;
  
  public CryptoKeyId getCryptoKeyId() {
    return this.cryptoKeyId;
  }
  
  public void setCryptoKeyId(CryptoKeyId paramCryptoKeyId) {
    this.cryptoKeyId = paramCryptoKeyId;
  }
}
