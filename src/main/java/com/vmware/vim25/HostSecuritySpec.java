package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.HostSecuritySpec;
import com.vmware.vim25.Permission;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HostSecuritySpec", propOrder = {"adminPassword", "removePermission", "addPermission"})
public class HostSecuritySpec extends DynamicData {
  protected String adminPassword;
  
  protected List<Permission> removePermission;
  
  protected List<Permission> addPermission;
  
  public String getAdminPassword() {
    return this.adminPassword;
  }
  
  public void setAdminPassword(String paramString) {
    this.adminPassword = paramString;
  }
  
  public List<Permission> getRemovePermission() {
    if (this.removePermission == null)
      this.removePermission = new ArrayList<>(); 
    return this.removePermission;
  }
  
  public List<Permission> getAddPermission() {
    if (this.addPermission == null)
      this.addPermission = new ArrayList<>(); 
    return this.addPermission;
  }
}
