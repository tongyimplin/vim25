package com.vmware.vim25;

import com.vmware.vim25.CryptoSpec;
import com.vmware.vim25.FileBackedVirtualDiskSpec;
import com.vmware.vim25.SeSparseVirtualDiskSpec;
import com.vmware.vim25.VirtualDiskSpec;
import com.vmware.vim25.VirtualMachineProfileSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FileBackedVirtualDiskSpec", propOrder = {"capacityKb", "profile", "crypto"})
@XmlSeeAlso({SeSparseVirtualDiskSpec.class})
public class FileBackedVirtualDiskSpec extends VirtualDiskSpec {
  protected long capacityKb;
  
  protected List<VirtualMachineProfileSpec> profile;
  
  protected CryptoSpec crypto;
  
  public long getCapacityKb() {
    return this.capacityKb;
  }
  
  public void setCapacityKb(long paramLong) {
    this.capacityKb = paramLong;
  }
  
  public List<VirtualMachineProfileSpec> getProfile() {
    if (this.profile == null)
      this.profile = new ArrayList<>(); 
    return this.profile;
  }
  
  public CryptoSpec getCrypto() {
    return this.crypto;
  }
  
  public void setCrypto(CryptoSpec paramCryptoSpec) {
    this.crypto = paramCryptoSpec;
  }
}
