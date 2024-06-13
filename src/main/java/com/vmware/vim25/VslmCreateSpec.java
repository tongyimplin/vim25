package com.vmware.vim25;

import com.vmware.vim25.CryptoSpec;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.VirtualMachineProfileSpec;
import com.vmware.vim25.VslmCreateSpec;
import com.vmware.vim25.VslmCreateSpecBackingSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VslmCreateSpec", propOrder = {"name", "keepAfterDeleteVm", "backingSpec", "capacityInMB", "profile", "crypto", "metadata"})
public class VslmCreateSpec extends DynamicData {
  @XmlElement(required = true)
  protected String name;
  
  protected Boolean keepAfterDeleteVm;
  
  @XmlElement(required = true)
  protected VslmCreateSpecBackingSpec backingSpec;
  
  protected long capacityInMB;
  
  protected List<VirtualMachineProfileSpec> profile;
  
  protected CryptoSpec crypto;
  
  protected List<KeyValue> metadata;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public Boolean isKeepAfterDeleteVm() {
    return this.keepAfterDeleteVm;
  }
  
  public void setKeepAfterDeleteVm(Boolean paramBoolean) {
    this.keepAfterDeleteVm = paramBoolean;
  }
  
  public VslmCreateSpecBackingSpec getBackingSpec() {
    return this.backingSpec;
  }
  
  public void setBackingSpec(VslmCreateSpecBackingSpec paramVslmCreateSpecBackingSpec) {
    this.backingSpec = paramVslmCreateSpecBackingSpec;
  }
  
  public long getCapacityInMB() {
    return this.capacityInMB;
  }
  
  public void setCapacityInMB(long paramLong) {
    this.capacityInMB = paramLong;
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
  
  public List<KeyValue> getMetadata() {
    if (this.metadata == null)
      this.metadata = new ArrayList<>(); 
    return this.metadata;
  }
}
