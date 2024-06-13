package com.vmware.vim25;

import com.vmware.vim25.CryptoSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualDeviceConfigSpecBackingSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualDeviceConfigSpecBackingSpec", propOrder = {"parent", "crypto"})
public class VirtualDeviceConfigSpecBackingSpec extends DynamicData {
  protected VirtualDeviceConfigSpecBackingSpec parent;
  
  protected CryptoSpec crypto;
  
  public VirtualDeviceConfigSpecBackingSpec getParent() {
    return this.parent;
  }
  
  public void setParent(VirtualDeviceConfigSpecBackingSpec paramVirtualDeviceConfigSpecBackingSpec) {
    this.parent = paramVirtualDeviceConfigSpecBackingSpec;
  }
  
  public CryptoSpec getCrypto() {
    return this.crypto;
  }
  
  public void setCrypto(CryptoSpec paramCryptoSpec) {
    this.crypto = paramCryptoSpec;
  }
}
