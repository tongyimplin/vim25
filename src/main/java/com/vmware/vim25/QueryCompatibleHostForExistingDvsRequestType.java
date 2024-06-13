package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryCompatibleHostForExistingDvsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryCompatibleHostForExistingDvsRequestType", propOrder = {"_this", "container", "recursive", "dvs"})
public class QueryCompatibleHostForExistingDvsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ManagedObjectReference container;
  
  protected boolean recursive;
  
  @XmlElement(required = true)
  protected ManagedObjectReference dvs;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ManagedObjectReference getContainer() {
    return this.container;
  }
  
  public void setContainer(ManagedObjectReference paramManagedObjectReference) {
    this.container = paramManagedObjectReference;
  }
  
  public boolean isRecursive() {
    return this.recursive;
  }
  
  public void setRecursive(boolean paramBoolean) {
    this.recursive = paramBoolean;
  }
  
  public ManagedObjectReference getDvs() {
    return this.dvs;
  }
  
  public void setDvs(ManagedObjectReference paramManagedObjectReference) {
    this.dvs = paramManagedObjectReference;
  }
}
