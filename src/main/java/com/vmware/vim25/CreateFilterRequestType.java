package com.vmware.vim25;

import com.vmware.vim25.CreateFilterRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PropertyFilterSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateFilterRequestType", propOrder = {"_this", "spec", "partialUpdates"})
public class CreateFilterRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected PropertyFilterSpec spec;
  
  protected boolean partialUpdates;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public PropertyFilterSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(PropertyFilterSpec paramPropertyFilterSpec) {
    this.spec = paramPropertyFilterSpec;
  }
  
  public boolean isPartialUpdates() {
    return this.partialUpdates;
  }
  
  public void setPartialUpdates(boolean paramBoolean) {
    this.partialUpdates = paramBoolean;
  }
}
