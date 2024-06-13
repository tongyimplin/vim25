package com.vmware.vim25;

import com.vmware.vim25.CreateDefaultProfileRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateDefaultProfileRequestType", propOrder = {"_this", "profileType", "profileTypeName", "profile"})
public class CreateDefaultProfileRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String profileType;
  
  protected String profileTypeName;
  
  protected ManagedObjectReference profile;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getProfileType() {
    return this.profileType;
  }
  
  public void setProfileType(String paramString) {
    this.profileType = paramString;
  }
  
  public String getProfileTypeName() {
    return this.profileTypeName;
  }
  
  public void setProfileTypeName(String paramString) {
    this.profileTypeName = paramString;
  }
  
  public ManagedObjectReference getProfile() {
    return this.profile;
  }
  
  public void setProfile(ManagedObjectReference paramManagedObjectReference) {
    this.profile = paramManagedObjectReference;
  }
}
