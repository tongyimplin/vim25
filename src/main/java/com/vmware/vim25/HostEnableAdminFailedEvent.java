package com.vmware.vim25;

import com.vmware.vim25.HostEnableAdminFailedEvent;
import com.vmware.vim25.HostEvent;
import com.vmware.vim25.Permission;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostEnableAdminFailedEvent", propOrder = {"permissions"})
public class HostEnableAdminFailedEvent extends HostEvent {
  @XmlElement(required = true)
  protected List<Permission> permissions;
  
  public List<Permission> getPermissions() {
    if (this.permissions == null)
      this.permissions = new ArrayList<>(); 
    return this.permissions;
  }
}
