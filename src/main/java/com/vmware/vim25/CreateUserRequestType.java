package com.vmware.vim25;

import com.vmware.vim25.CreateUserRequestType;
import com.vmware.vim25.HostAccountSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateUserRequestType", propOrder = {"_this", "user"})
public class CreateUserRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostAccountSpec user;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostAccountSpec getUser() {
    return this.user;
  }
  
  public void setUser(HostAccountSpec paramHostAccountSpec) {
    this.user = paramHostAccountSpec;
  }
}
