package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.CryptoSpecNoOp;
import com.vmware.vim25.CryptoSpecRegister;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoSpecRegister", propOrder = {"cryptoKeyId"})
public class CryptoSpecRegister extends CryptoSpecNoOp {
  @XmlElement(required = true)
  protected CryptoKeyId cryptoKeyId;
  
  public CryptoKeyId getCryptoKeyId() {
    return this.cryptoKeyId;
  }
  
  public void setCryptoKeyId(CryptoKeyId paramCryptoKeyId) {
    this.cryptoKeyId = paramCryptoKeyId;
  }
}
