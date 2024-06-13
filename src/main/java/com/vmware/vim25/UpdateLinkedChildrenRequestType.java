package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateLinkedChildrenRequestType;
import com.vmware.vim25.VirtualAppLinkInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateLinkedChildrenRequestType", propOrder = {"_this", "addChangeSet", "removeSet"})
public class UpdateLinkedChildrenRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<VirtualAppLinkInfo> addChangeSet;
  
  protected List<ManagedObjectReference> removeSet;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<VirtualAppLinkInfo> getAddChangeSet() {
    if (this.addChangeSet == null)
      this.addChangeSet = new ArrayList<>(); 
    return this.addChangeSet;
  }
  
  public List<ManagedObjectReference> getRemoveSet() {
    if (this.removeSet == null)
      this.removeSet = new ArrayList<>(); 
    return this.removeSet;
  }
}
