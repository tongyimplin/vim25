package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UnassignUserFromGroupRequestType;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UnassignUserFromGroupRequestType", propOrder = {"_this", "user", "group"})
public class UnassignUserFromGroupRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected String user;
  
  @XmlElement(required = true)
  protected String group;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public String getUser() {
    return this.user;
  }
  
  public void setUser(String paramString) {
    this.user = paramString;
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public void setGroup(String paramString) {
    this.group = paramString;
  }
}
