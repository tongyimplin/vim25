package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryComplianceStatusRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryComplianceStatusRequestType", propOrder = {"_this", "profile", "entity"})
public class QueryComplianceStatusRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<ManagedObjectReference> profile;
  
  protected List<ManagedObjectReference> entity;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<ManagedObjectReference> getProfile() {
    if (this.profile == null)
      this.profile = new ArrayList<>(); 
    return this.profile;
  }
  
  public List<ManagedObjectReference> getEntity() {
    if (this.entity == null)
      this.entity = new ArrayList<>(); 
    return this.entity;
  }
}
