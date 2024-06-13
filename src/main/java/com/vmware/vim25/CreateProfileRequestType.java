package com.vmware.vim25;

import com.vmware.vim25.CreateProfileRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ProfileCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateProfileRequestType", propOrder = {"_this", "createSpec"})
public class CreateProfileRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected ProfileCreateSpec createSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public ProfileCreateSpec getCreateSpec() {
    return this.createSpec;
  }
  
  public void setCreateSpec(ProfileCreateSpec paramProfileCreateSpec) {
    this.createSpec = paramProfileCreateSpec;
  }
}
