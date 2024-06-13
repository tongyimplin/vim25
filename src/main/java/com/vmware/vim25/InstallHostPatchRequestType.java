package com.vmware.vim25;

import com.vmware.vim25.HostPatchManagerLocator;
import com.vmware.vim25.InstallHostPatchRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InstallHostPatchRequestType", propOrder = {"_this", "repository", "updateID", "force"})
public class InstallHostPatchRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostPatchManagerLocator repository;
  
  @XmlElement(required = true)
  protected String updateID;
  
  protected Boolean force;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostPatchManagerLocator getRepository() {
    return this.repository;
  }
  
  public void setRepository(HostPatchManagerLocator paramHostPatchManagerLocator) {
    this.repository = paramHostPatchManagerLocator;
  }
  
  public String getUpdateID() {
    return this.updateID;
  }
  
  public void setUpdateID(String paramString) {
    this.updateID = paramString;
  }
  
  public Boolean isForce() {
    return this.force;
  }
  
  public void setForce(Boolean paramBoolean) {
    this.force = paramBoolean;
  }
}
