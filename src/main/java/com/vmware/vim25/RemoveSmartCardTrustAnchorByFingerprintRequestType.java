package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveSmartCardTrustAnchorByFingerprintRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveSmartCardTrustAnchorByFingerprintRequestType", propOrder = {"_this", "fingerprint", "digest"})
public class RemoveSmartCardTrustAnchorByFingerprintRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String fingerprint;
  
  @XmlElement(required = true)
  protected String digest;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getFingerprint() {
    return this.fingerprint;
  }
  
  public void setFingerprint(String paramString) {
    this.fingerprint = paramString;
  }
  
  public String getDigest() {
    return this.digest;
  }
  
  public void setDigest(String paramString) {
    this.digest = paramString;
  }
}
