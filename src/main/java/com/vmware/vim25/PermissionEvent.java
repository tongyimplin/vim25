package com.vmware.vim25;

import com.vmware.vim25.AuthorizationEvent;
import com.vmware.vim25.ManagedEntityEventArgument;
import com.vmware.vim25.PermissionAddedEvent;
import com.vmware.vim25.PermissionEvent;
import com.vmware.vim25.PermissionRemovedEvent;
import com.vmware.vim25.PermissionUpdatedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PermissionEvent", propOrder = {"entity", "principal", "group"})
@XmlSeeAlso({PermissionUpdatedEvent.class, PermissionRemovedEvent.class, PermissionAddedEvent.class})
public class PermissionEvent extends AuthorizationEvent {
  @XmlElement(required = true)
  protected ManagedEntityEventArgument entity;
  
  @XmlElement(required = true)
  protected String principal;
  
  protected boolean group;
  
  public ManagedEntityEventArgument getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedEntityEventArgument paramManagedEntityEventArgument) {
    this.entity = paramManagedEntityEventArgument;
  }
  
  public String getPrincipal() {
    return this.principal;
  }
  
  public void setPrincipal(String paramString) {
    this.principal = paramString;
  }
  
  public boolean isGroup() {
    return this.group;
  }
  
  public void setGroup(boolean paramBoolean) {
    this.group = paramBoolean;
  }
}
