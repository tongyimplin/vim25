package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveSnapshotRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveSnapshotRequestType", propOrder = {"_this", "removeChildren", "consolidate"})
public class RemoveSnapshotRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected boolean removeChildren;
  
  protected Boolean consolidate;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public boolean isRemoveChildren() {
    return this.removeChildren;
  }
  
  public void setRemoveChildren(boolean paramBoolean) {
    this.removeChildren = paramBoolean;
  }
  
  public Boolean isConsolidate() {
    return this.consolidate;
  }
  
  public void setConsolidate(Boolean paramBoolean) {
    this.consolidate = paramBoolean;
  }
}
