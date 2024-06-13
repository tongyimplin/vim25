package com.vmware.vim25;

import com.vmware.vim25.EventArgument;
import com.vmware.vim25.RoleEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleEventArgument", propOrder = {"roleId", "name"})
public class RoleEventArgument extends EventArgument {
  protected int roleId;
  
  @XmlElement(required = true)
  protected String name;
  
  public int getRoleId() {
    return this.roleId;
  }
  
  public void setRoleId(int paramInt) {
    this.roleId = paramInt;
  }
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
}
