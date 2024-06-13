package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RecommendDatastoresRequestType;
import com.vmware.vim25.StoragePlacementSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RecommendDatastoresRequestType", propOrder = {"_this", "storageSpec"})
public class RecommendDatastoresRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected StoragePlacementSpec storageSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public StoragePlacementSpec getStorageSpec() {
    return this.storageSpec;
  }
  
  public void setStorageSpec(StoragePlacementSpec paramStoragePlacementSpec) {
    this.storageSpec = paramStoragePlacementSpec;
  }
}
