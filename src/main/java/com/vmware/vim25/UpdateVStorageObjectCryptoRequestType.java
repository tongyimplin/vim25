package com.vmware.vim25;

import com.vmware.vim25.DiskCryptoSpec;
import com.vmware.vim25.ID;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateVStorageObjectCryptoRequestType;
import com.vmware.vim25.VirtualMachineProfileSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateVStorageObjectCryptoRequestType", propOrder = {"_this", "id", "datastore", "profile", "disksCrypto"})
public class UpdateVStorageObjectCryptoRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ID id;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  protected List<VirtualMachineProfileSpec> profile;
  
  protected DiskCryptoSpec disksCrypto;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ID getId() {
    return this.id;
  }
  
  public void setId(ID paramID) {
    this.id = paramID;
  }
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public List<VirtualMachineProfileSpec> getProfile() {
    if (this.profile == null)
      this.profile = new ArrayList<>(); 
    return this.profile;
  }
  
  public DiskCryptoSpec getDisksCrypto() {
    return this.disksCrypto;
  }
  
  public void setDisksCrypto(DiskCryptoSpec paramDiskCryptoSpec) {
    this.disksCrypto = paramDiskCryptoSpec;
  }
}
