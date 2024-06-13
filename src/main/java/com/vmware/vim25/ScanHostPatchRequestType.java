package com.vmware.vim25;

import com.vmware.vim25.HostPatchManagerLocator;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ScanHostPatchRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScanHostPatchRequestType", propOrder = {"_this", "repository", "updateID"})
public class ScanHostPatchRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostPatchManagerLocator repository;
  
  protected List<String> updateID;
  
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
  
  public List<String> getUpdateID() {
    if (this.updateID == null)
      this.updateID = new ArrayList<>(); 
    return this.updateID;
  }
}
