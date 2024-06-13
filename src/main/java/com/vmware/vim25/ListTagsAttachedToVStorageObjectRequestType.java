package com.vmware.vim25;

import com.vmware.vim25.ID;
import com.vmware.vim25.ListTagsAttachedToVStorageObjectRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListTagsAttachedToVStorageObjectRequestType", propOrder = {"_this", "id"})
public class ListTagsAttachedToVStorageObjectRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ID id;
  
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
}
