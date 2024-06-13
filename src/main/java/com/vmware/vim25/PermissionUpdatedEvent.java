package com.vmware.vim25;

import com.vmware.vim25.PermissionEvent;
import com.vmware.vim25.PermissionUpdatedEvent;
import com.vmware.vim25.RoleEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionUpdatedEvent", propOrder = {"role", "propagate", "prevRole", "prevPropagate"})
public class PermissionUpdatedEvent extends PermissionEvent {
  @XmlElement(required = true)
  protected RoleEventArgument role;
  
  protected boolean propagate;
  
  protected RoleEventArgument prevRole;
  
  protected Boolean prevPropagate;
  
  public RoleEventArgument getRole() {
    return this.role;
  }
  
  public void setRole(RoleEventArgument paramRoleEventArgument) {
    this.role = paramRoleEventArgument;
  }
  
  public boolean isPropagate() {
    return this.propagate;
  }
  
  public void setPropagate(boolean paramBoolean) {
    this.propagate = paramBoolean;
  }
  
  public RoleEventArgument getPrevRole() {
    return this.prevRole;
  }
  
  public void setPrevRole(RoleEventArgument paramRoleEventArgument) {
    this.prevRole = paramRoleEventArgument;
  }
  
  public Boolean isPrevPropagate() {
    return this.prevPropagate;
  }
  
  public void setPrevPropagate(Boolean paramBoolean) {
    this.prevPropagate = paramBoolean;
  }
}
