package com.vmware.vim25;

import com.vmware.vim25.DiskCryptoSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.VirtualMachineProfileSpec;
import com.vmware.vim25.VslmCloneSpec;
import com.vmware.vim25.VslmCreateSpecBackingSpec;
import com.vmware.vim25.VslmMigrateSpec;
import com.vmware.vim25.VslmRelocateSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VslmMigrateSpec", propOrder = {"backingSpec", "profile", "consolidate", "disksCrypto"})
@XmlSeeAlso({VslmRelocateSpec.class, VslmCloneSpec.class})
public class VslmMigrateSpec extends DynamicData {
  @XmlElement(required = true)
  protected VslmCreateSpecBackingSpec backingSpec;
  
  protected List<VirtualMachineProfileSpec> profile;
  
  protected Boolean consolidate;
  
  protected DiskCryptoSpec disksCrypto;
  
  public VslmCreateSpecBackingSpec getBackingSpec() {
    return this.backingSpec;
  }
  
  public void setBackingSpec(VslmCreateSpecBackingSpec paramVslmCreateSpecBackingSpec) {
    this.backingSpec = paramVslmCreateSpecBackingSpec;
  }
  
  public List<VirtualMachineProfileSpec> getProfile() {
    if (this.profile == null)
      this.profile = new ArrayList<>(); 
    return this.profile;
  }
  
  public Boolean isConsolidate() {
    return this.consolidate;
  }
  
  public void setConsolidate(Boolean paramBoolean) {
    this.consolidate = paramBoolean;
  }
  
  public DiskCryptoSpec getDisksCrypto() {
    return this.disksCrypto;
  }
  
  public void setDisksCrypto(DiskCryptoSpec paramDiskCryptoSpec) {
    this.disksCrypto = paramDiskCryptoSpec;
  }
}
