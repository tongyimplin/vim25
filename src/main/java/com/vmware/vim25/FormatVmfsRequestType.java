package com.vmware.vim25;

import com.vmware.vim25.FormatVmfsRequestType;
import com.vmware.vim25.HostVmfsSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormatVmfsRequestType", propOrder = {"_this", "createSpec"})
public class FormatVmfsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostVmfsSpec createSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostVmfsSpec getCreateSpec() {
    return this.createSpec;
  }
  
  public void setCreateSpec(HostVmfsSpec paramHostVmfsSpec) {
    this.createSpec = paramHostVmfsSpec;
  }
}
