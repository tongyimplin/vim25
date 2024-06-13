package com.vmware.vim25;

import com.vmware.vim25.Permission;
import com.vmware.vim25.RetrieveRolePermissionsResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "RetrieveRolePermissionsResponse")
public class RetrieveRolePermissionsResponse {
  protected List<Permission> returnval;
  
  public List<Permission> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
