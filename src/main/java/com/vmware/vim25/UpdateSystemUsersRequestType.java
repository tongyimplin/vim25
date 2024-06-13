package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.UpdateSystemUsersRequestType;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UpdateSystemUsersRequestType", propOrder = {"_this", "users"})
public class UpdateSystemUsersRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  protected List<String> users;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public List<String> getUsers() {
    if (this.users == null)
      this.users = new ArrayList<>(); 
    return this.users;
  }
}
