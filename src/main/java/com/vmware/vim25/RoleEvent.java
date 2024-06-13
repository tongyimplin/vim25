package com.vmware.vim25;

import com.vmware.vim25.AuthorizationEvent;
import com.vmware.vim25.RoleAddedEvent;
import com.vmware.vim25.RoleEvent;
import com.vmware.vim25.RoleEventArgument;
import com.vmware.vim25.RoleRemovedEvent;
import com.vmware.vim25.RoleUpdatedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleEvent", propOrder = {"role"})
@XmlSeeAlso({RoleAddedEvent.class, RoleRemovedEvent.class, RoleUpdatedEvent.class})
public class RoleEvent extends AuthorizationEvent {
  @XmlElement(required = true)
  protected RoleEventArgument role;
  
  public RoleEventArgument getRole() {
    return this.role;
  }
  
  public void setRole(RoleEventArgument paramRoleEventArgument) {
    this.role = paramRoleEventArgument;
  }
}
