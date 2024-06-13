package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.MarkForRemovalRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MarkForRemovalRequestType", propOrder = {"_this", "hbaName", "remove"})
public class MarkForRemovalRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String hbaName;
  
  protected boolean remove;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getHbaName() {
    return this.hbaName;
  }
  
  public void setHbaName(String paramString) {
    this.hbaName = paramString;
  }
  
  public boolean isRemove() {
    return this.remove;
  }
  
  public void setRemove(boolean paramBoolean) {
    this.remove = paramBoolean;
  }
}
