package com.vmware.vim25;

import com.vmware.vim25.ApplyProfile;
import com.vmware.vim25.PermissionProfile;
import com.vmware.vim25.SecurityProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SecurityProfile", propOrder = {"permission"})
public class SecurityProfile extends ApplyProfile {
  protected List<PermissionProfile> permission;
  
  public List<PermissionProfile> getPermission() {
    if (this.permission == null)
      this.permission = new ArrayList<>(); 
    return this.permission;
  }
}
