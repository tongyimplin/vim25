package com.vmware.vim25;

import com.vmware.vim25.CryptoSpec;
import com.vmware.vim25.DiskCryptoSpec;
import com.vmware.vim25.DynamicData;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DiskCryptoSpec", propOrder = {"parent", "crypto"})
public class DiskCryptoSpec extends DynamicData {
  protected DiskCryptoSpec parent;
  
  @XmlElement(required = true)
  protected CryptoSpec crypto;
  
  public DiskCryptoSpec getParent() {
    return this.parent;
  }
  
  public void setParent(DiskCryptoSpec paramDiskCryptoSpec) {
    this.parent = paramDiskCryptoSpec;
  }
  
  public CryptoSpec getCrypto() {
    return this.crypto;
  }
  
  public void setCrypto(CryptoSpec paramCryptoSpec) {
    this.crypto = paramCryptoSpec;
  }
}
