package com.vmware.vim25;

import com.vmware.vim25.CreateNvdimmPMemNamespaceRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NvdimmPMemNamespaceCreateSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateNvdimmPMemNamespaceRequestType", propOrder = {"_this", "createSpec"})
public class CreateNvdimmPMemNamespaceRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected NvdimmPMemNamespaceCreateSpec createSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public NvdimmPMemNamespaceCreateSpec getCreateSpec() {
    return this.createSpec;
  }
  
  public void setCreateSpec(NvdimmPMemNamespaceCreateSpec paramNvdimmPMemNamespaceCreateSpec) {
    this.createSpec = paramNvdimmPMemNamespaceCreateSpec;
  }
}
