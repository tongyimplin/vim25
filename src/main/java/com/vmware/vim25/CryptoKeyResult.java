package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.CryptoKeyResult;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoKeyResult", propOrder = {"keyId", "success", "reason"})
public class CryptoKeyResult extends DynamicData {
  @XmlElement(required = true)
  protected CryptoKeyId keyId;
  
  protected boolean success;
  
  protected String reason;
  
  public CryptoKeyId getKeyId() {
    return this.keyId;
  }
  
  public void setKeyId(CryptoKeyId paramCryptoKeyId) {
    this.keyId = paramCryptoKeyId;
  }
  
  public boolean isSuccess() {
    return this.success;
  }
  
  public void setSuccess(boolean paramBoolean) {
    this.success = paramBoolean;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
}
