package com.vmware.vim25;

import com.vmware.vim25.CryptoKeyId;
import com.vmware.vim25.CryptoManagerKmipCryptoKeyStatus;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CryptoManagerKmipCryptoKeyStatus", propOrder = {"keyId", "keyAvailable", "reason", "encryptedVMs", "affectedHosts", "referencedByTags"})
public class CryptoManagerKmipCryptoKeyStatus extends DynamicData {
  @XmlElement(required = true)
  protected CryptoKeyId keyId;
  
  protected Boolean keyAvailable;
  
  protected String reason;
  
  protected List<ManagedObjectReference> encryptedVMs;
  
  protected List<ManagedObjectReference> affectedHosts;
  
  protected List<String> referencedByTags;
  
  public CryptoKeyId getKeyId() {
    return this.keyId;
  }
  
  public void setKeyId(CryptoKeyId paramCryptoKeyId) {
    this.keyId = paramCryptoKeyId;
  }
  
  public Boolean isKeyAvailable() {
    return this.keyAvailable;
  }
  
  public void setKeyAvailable(Boolean paramBoolean) {
    this.keyAvailable = paramBoolean;
  }
  
  public String getReason() {
    return this.reason;
  }
  
  public void setReason(String paramString) {
    this.reason = paramString;
  }
  
  public List<ManagedObjectReference> getEncryptedVMs() {
    if (this.encryptedVMs == null)
      this.encryptedVMs = new ArrayList<>(); 
    return this.encryptedVMs;
  }
  
  public List<ManagedObjectReference> getAffectedHosts() {
    if (this.affectedHosts == null)
      this.affectedHosts = new ArrayList<>(); 
    return this.affectedHosts;
  }
  
  public List<String> getReferencedByTags() {
    if (this.referencedByTags == null)
      this.referencedByTags = new ArrayList<>(); 
    return this.referencedByTags;
  }
}
