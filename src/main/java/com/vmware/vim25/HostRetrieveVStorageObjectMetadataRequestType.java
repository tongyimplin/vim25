package com.vmware.vim25;

import com.vmware.vim25.HostRetrieveVStorageObjectMetadataRequestType;
import com.vmware.vim25.ID;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostRetrieveVStorageObjectMetadataRequestType", propOrder = {"_this", "id", "datastore", "snapshotId", "prefix"})
public class HostRetrieveVStorageObjectMetadataRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ID id;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  protected ID snapshotId;
  
  protected String prefix;
  
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
  
  public String getPrefix() {
    return this.prefix;
  }
  
  public void setPrefix(String paramString) {
    this.prefix = paramString;
  }
}
