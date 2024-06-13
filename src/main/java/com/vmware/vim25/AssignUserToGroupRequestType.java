package com.vmware.vim25;

import com.vmware.vim25.AssignUserToGroupRequestType;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssignUserToGroupRequestType", propOrder = {"_this", "user", "group"})
public class AssignUserToGroupRequestType {
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
