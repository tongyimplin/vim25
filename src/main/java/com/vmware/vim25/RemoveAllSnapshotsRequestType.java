package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.RemoveAllSnapshotsRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RemoveAllSnapshotsRequestType", propOrder = {"_this", "consolidate"})
public class RemoveAllSnapshotsRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected Boolean consolidate;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public Boolean isConsolidate() {
    return this.consolidate;
  }
  
  public void setConsolidate(Boolean paramBoolean) {
    this.consolidate = paramBoolean;
  }
}
