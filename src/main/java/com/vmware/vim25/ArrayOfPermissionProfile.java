package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPermissionProfile;
import com.vmware.vim25.PermissionProfile;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPermissionProfile", propOrder = {"permissionProfile"})
public class ArrayOfPermissionProfile {
  @XmlElement(name = "PermissionProfile")
  protected List<PermissionProfile> permissionProfile;
  
  public List<PermissionProfile> getPermissionProfile() {
    if (this.permissionProfile == null)
      this.permissionProfile = new ArrayList<>(); 
    return this.permissionProfile;
  }
}
