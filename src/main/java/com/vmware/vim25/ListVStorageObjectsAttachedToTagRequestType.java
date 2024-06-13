package com.vmware.vim25;

import com.vmware.vim25.ListVStorageObjectsAttachedToTagRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ListVStorageObjectsAttachedToTagRequestType", propOrder = {"_this", "category", "tag"})
public class ListVStorageObjectsAttachedToTagRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String category;
  
  @XmlElement(required = true)
  protected String tag;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getCategory() {
    return this.category;
  }
  
  public void setCategory(String paramString) {
    this.category = paramString;
  }
  
  public String getTag() {
    return this.tag;
  }
  
  public void setTag(String paramString) {
    this.tag = paramString;
  }
}
