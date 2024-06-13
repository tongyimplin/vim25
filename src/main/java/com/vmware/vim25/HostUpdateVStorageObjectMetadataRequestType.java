package com.vmware.vim25;

import com.vmware.vim25.HostUpdateVStorageObjectMetadataRequestType;
import com.vmware.vim25.ID;
import com.vmware.vim25.KeyValue;
import com.vmware.vim25.ManagedObjectReference;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostUpdateVStorageObjectMetadataRequestType", propOrder = {"_this", "id", "datastore", "metadata", "deleteKeys"})
public class HostUpdateVStorageObjectMetadataRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ID id;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  protected List<KeyValue> metadata;
  
  protected List<String> deleteKeys;
  
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
  
  public List<KeyValue> getMetadata() {
    if (this.metadata == null)
      this.metadata = new ArrayList<>(); 
    return this.metadata;
  }
  
  public List<String> getDeleteKeys() {
    if (this.deleteKeys == null)
      this.deleteKeys = new ArrayList<>(); 
    return this.deleteKeys;
  }
}
