package com.vmware.vim25;

import com.vmware.vim25.CreateDirectoryRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDirectoryRequestType", propOrder = {"_this", "datastore", "displayName", "policy"})
public class CreateDirectoryRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference datastore;
  
  protected String displayName;
  
  protected String policy;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getDatastore() {
    return this.datastore;
  }
  
  public void setDatastore(ManagedObjectReference paramManagedObjectReference) {
    this.datastore = paramManagedObjectReference;
  }
  
  public String getDisplayName() {
    return this.displayName;
  }
  
  public void setDisplayName(String paramString) {
    this.displayName = paramString;
  }
  
  public String getPolicy() {
    return this.policy;
  }
  
  public void setPolicy(String paramString) {
    this.policy = paramString;
  }
}
