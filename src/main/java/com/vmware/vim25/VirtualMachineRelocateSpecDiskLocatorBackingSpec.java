package com.vmware.vim25;

import com.vmware.vim25.CryptoSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineRelocateSpecDiskLocatorBackingSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VirtualMachineRelocateSpecDiskLocatorBackingSpec", propOrder = {"parent", "crypto"})
public class VirtualMachineRelocateSpecDiskLocatorBackingSpec extends DynamicData {
  protected VirtualMachineRelocateSpecDiskLocatorBackingSpec parent;
  
  protected CryptoSpec crypto;
  
  public VirtualMachineRelocateSpecDiskLocatorBackingSpec getParent() {
    return this.parent;
  }
  
  public void setParent(VirtualMachineRelocateSpecDiskLocatorBackingSpec paramVirtualMachineRelocateSpecDiskLocatorBackingSpec) {
    this.parent = paramVirtualMachineRelocateSpecDiskLocatorBackingSpec;
  }
  
  public CryptoSpec getCrypto() {
    return this.crypto;
  }
  
  public void setCrypto(CryptoSpec paramCryptoSpec) {
    this.crypto = paramCryptoSpec;
  }
}
