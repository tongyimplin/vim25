package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyProviderId;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoKeyId", propOrder = {"keyId", "providerId"})
public class CryptoKeyId extends DynamicData {
  @XmlElement(required = true)
  protected String keyId;
  
  protected KeyProviderId providerId;
  
  public String getKeyId() {
    return this.keyId;
  }
  
  public void setKeyId(String paramString) {
    this.keyId = paramString;
  }
  
  public KeyProviderId getProviderId() {
    return this.providerId;
  }
  
  public void setProviderId(KeyProviderId paramKeyProviderId) {
    this.providerId = paramKeyProviderId;
  }
}
