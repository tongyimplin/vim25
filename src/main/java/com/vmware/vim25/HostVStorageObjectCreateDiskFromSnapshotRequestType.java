package com.vmware.vim25;

import com.vmware.vim25.CryptoSpec;
import com.vmware.vim25.HostVStorageObjectCreateDiskFromSnapshotRequestType;
import com.vmware.vim25.ID;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.VirtualMachineProfileSpec;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostVStorageObjectCreateDiskFromSnapshotRequestType", propOrder = {"_this", "id", "datastore", "snapshotId", "name", "profile", "crypto", "path"})
public class HostVStorageObjectCreateDiskFromSnapshotRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ID id;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  @XmlElement(required = true)
  protected ID snapshotId;
  
  @XmlElement(required = true)
  protected String name;
  
  protected List<VirtualMachineProfileSpec> profile;
  
  protected CryptoSpec crypto;
  
  protected String path;
  
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
  
  public ID getSnapshotId() {
    return this.snapshotId;
  }
  
  public void setSnapshotId(ID paramID) {
    this.snapshotId = paramID;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
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
  
  public String getPath() {
    return this.path;
  }
  
  public void setPath(String paramString) {
    this.path = paramString;
  }
}
