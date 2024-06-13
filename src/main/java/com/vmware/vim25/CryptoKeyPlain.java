package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.CryptoKeyPlain;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoKeyPlain", propOrder = {"keyId", "algorithm", "keyData"})
public class CryptoKeyPlain extends DynamicData {
  @XmlElement(required = true)
  protected CryptoKeyId keyId;
  
  @XmlElement(required = true)
  protected String algorithm;
  
  @XmlElement(required = true)
  protected String keyData;
  
  public CryptoKeyId getKeyId() {
    return this.keyId;
  }
  
  public void setKeyId(CryptoKeyId paramCryptoKeyId) {
    this.keyId = paramCryptoKeyId;
  }
  
  public String getAlgorithm() {
    return this.algorithm;
  }
  
  public void setAlgorithm(String paramString) {
    this.algorithm = paramString;
  }
  
  public String getKeyData() {
    return this.keyData;
  }
  
  public void setKeyData(String paramString) {
    this.keyData = paramString;
  }
}
