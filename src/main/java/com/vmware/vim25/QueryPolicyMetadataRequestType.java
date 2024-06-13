package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryPolicyMetadataRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryPolicyMetadataRequestType", propOrder = {"_this", "policyName", "profile"})
public class QueryPolicyMetadataRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> policyName;
  
  protected ManagedObjectReference profile;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getPolicyName() {
    if (this.policyName == null)
      this.policyName = new ArrayList<>(); 
    return this.policyName;
  }
  
  public ManagedObjectReference getProfile() {
    return this.profile;
  }
  
  public void setProfile(ManagedObjectReference paramManagedObjectReference) {
    this.profile = paramManagedObjectReference;
  }
}
