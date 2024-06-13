package com.vmware.vim25;

import com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UninstallHostPatchRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UninstallHostPatchRequestType", propOrder = {"_this", "bulletinIds", "spec"})
public class UninstallHostPatchRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> bulletinIds;
  
  protected HostPatchManagerPatchManagerOperationSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getBulletinIds() {
    if (this.bulletinIds == null)
      this.bulletinIds = new ArrayList<>(); 
    return this.bulletinIds;
  }
  
  public HostPatchManagerPatchManagerOperationSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostPatchManagerPatchManagerOperationSpec paramHostPatchManagerPatchManagerOperationSpec) {
    this.spec = paramHostPatchManagerPatchManagerOperationSpec;
  }
}
