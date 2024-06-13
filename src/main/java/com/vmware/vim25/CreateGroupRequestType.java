package com.vmware.vim25;

import com.vmware.vim25.CreateGroupRequestType;
import com.vmware.vim25.HostAccountSpec;
import com.vmware.vim25.ManagedObjectReference;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateGroupRequestType", propOrder = {"_this", "group"})
public class CreateGroupRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected HostAccountSpec group;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public HostAccountSpec getGroup() {
    return this.group;
  }
  
  public void setGroup(HostAccountSpec paramHostAccountSpec) {
    this.group = paramHostAccountSpec;
  }
}
