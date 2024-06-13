package com.vmware.vim25;

import com.vmware.vim25.CreateNvdimmNamespaceRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NvdimmNamespaceCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateNvdimmNamespaceRequestType", propOrder = {"_this", "createSpec"})
public class CreateNvdimmNamespaceRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected NvdimmNamespaceCreateSpec createSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public NvdimmNamespaceCreateSpec getCreateSpec() {
    return this.createSpec;
  }
  
  public void setCreateSpec(NvdimmNamespaceCreateSpec paramNvdimmNamespaceCreateSpec) {
    this.createSpec = paramNvdimmNamespaceCreateSpec;
  }
}
