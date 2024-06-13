package com.vmware.vim25;

import com.vmware.vim25.HostPatchManagerPatchManagerOperationSpec;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.QueryHostPatchRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "QueryHostPatchRequestType", propOrder = {"_this", "spec"})
public class QueryHostPatchRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected HostPatchManagerPatchManagerOperationSpec spec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostPatchManagerPatchManagerOperationSpec getSpec() {
    return this.spec;
  }
  
  public void setSpec(HostPatchManagerPatchManagerOperationSpec paramHostPatchManagerPatchManagerOperationSpec) {
    this.spec = paramHostPatchManagerPatchManagerOperationSpec;
  }
}
