package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryHostProfileMetadataRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryHostProfileMetadataRequestType", propOrder = {"_this", "profileName", "profile"})
public class QueryHostProfileMetadataRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> profileName;
  
  protected ManagedObjectReference profile;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getProfileName() {
    if (this.profileName == null)
      this.profileName = new ArrayList<>(); 
    return this.profileName;
  }
  
  public ManagedObjectReference getProfile() {
    return this.profile;
  }
  
  public void setProfile(ManagedObjectReference paramManagedObjectReference) {
    this.profile = paramManagedObjectReference;
  }
}
