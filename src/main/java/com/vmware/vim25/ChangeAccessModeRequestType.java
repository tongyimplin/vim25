package com.vmware.vim25;

import com.vmware.vim25.ChangeAccessModeRequestType;
import com.vmware.vim25.HostAccessMode;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ChangeAccessModeRequestType", propOrder = {"_this", "principal", "isGroup", "accessMode"})
public class ChangeAccessModeRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String principal;
  
  protected boolean isGroup;
  
  @XmlElement(required = true)
  protected HostAccessMode accessMode;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getPrincipal() {
    return this.principal;
  }
  
  public void setPrincipal(String paramString) {
    this.principal = paramString;
  }
  
  public boolean isIsGroup() {
    return this.isGroup;
  }
  
  public void setIsGroup(boolean paramBoolean) {
    this.isGroup = paramBoolean;
  }
  
  public HostAccessMode getAccessMode() {
    return this.accessMode;
  }
  
  public void setAccessMode(HostAccessMode paramHostAccessMode) {
    this.accessMode = paramHostAccessMode;
  }
}
