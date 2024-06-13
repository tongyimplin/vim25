package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyResult;
import com.vmware.vim25.GenerateKeyResponse;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "GenerateKeyResponse")
public class GenerateKeyResponse {
  @XmlElement(required = true)
  protected CryptoKeyResult returnval;
  
  public CryptoKeyResult getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(CryptoKeyResult paramCryptoKeyResult) {
    this.returnval = paramCryptoKeyResult;
  }
}
