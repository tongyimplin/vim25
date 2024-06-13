package com.vmware.vim25;

import com.vmware.vim25.EntityPrivilege;
import com.vmware.vim25.HasPrivilegeOnEntitiesResponse;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "HasPrivilegeOnEntitiesResponse")
public class HasPrivilegeOnEntitiesResponse {
  protected List<EntityPrivilege> returnval;
  
  public List<EntityPrivilege> getReturnval() {
    if (this.returnval == null)
      this.returnval = new ArrayList<>(); 
    return this.returnval;
  }
}
