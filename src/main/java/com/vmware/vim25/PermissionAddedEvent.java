package com.vmware.vim25;

import com.vmware.vim25.PermissionAddedEvent;
import com.vmware.vim25.PermissionEvent;
import com.vmware.vim25.RoleEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionAddedEvent", propOrder = {"role", "propagate"})
public class PermissionAddedEvent extends PermissionEvent {
  @XmlElement(required = true)
  protected RoleEventArgument role;
  
  protected boolean propagate;
  
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
}
