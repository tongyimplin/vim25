package com.vmware.vim25;

import com.vmware.vim25.ArrayOfPermission;
import com.vmware.vim25.Permission;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfPermission", propOrder = {"permission"})
public class ArrayOfPermission {
  @XmlElement(name = "Permission")
  protected List<Permission> permission;
  
  public List<Permission> getPermission() {
    if (this.permission == null)
      this.permission = new ArrayList<>(); 
    return this.permission;
  }
}
