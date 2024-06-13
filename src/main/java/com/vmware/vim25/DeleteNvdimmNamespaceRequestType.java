package com.vmware.vim25;

import com.vmware.vim25.DeleteNvdimmNamespaceRequestType;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.NvdimmNamespaceDeleteSpec;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DeleteNvdimmNamespaceRequestType", propOrder = {"_this", "deleteSpec"})
public class DeleteNvdimmNamespaceRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected NvdimmNamespaceDeleteSpec deleteSpec;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public NvdimmNamespaceDeleteSpec getDeleteSpec() {
    return this.deleteSpec;
  }
  
  public void setDeleteSpec(NvdimmNamespaceDeleteSpec paramNvdimmNamespaceDeleteSpec) {
    this.deleteSpec = paramNvdimmNamespaceDeleteSpec;
  }
}
