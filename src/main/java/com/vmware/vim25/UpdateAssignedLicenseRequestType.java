package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateAssignedLicenseRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateAssignedLicenseRequestType", propOrder = {"_this", "entity", "licenseKey", "entityDisplayName"})
public class UpdateAssignedLicenseRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String entity;
  
  @XmlElement(required = true)
  protected String licenseKey;
  
  protected String entityDisplayName;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getEntity() {
    return this.entity;
  }
  
  public void setEntity(String paramString) {
    this.entity = paramString;
  }
  
  public String getLicenseKey() {
    return this.licenseKey;
  }
  
  public void setLicenseKey(String paramString) {
    this.licenseKey = paramString;
  }
  
  public String getEntityDisplayName() {
    return this.entityDisplayName;
  }
  
  public void setEntityDisplayName(String paramString) {
    this.entityDisplayName = paramString;
  }
}
