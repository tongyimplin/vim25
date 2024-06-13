package com.vmware.vim25;

import com.vmware.vim25.ArrayOfAuthorizationPrivilege;
import com.vmware.vim25.AuthorizationPrivilege;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAuthorizationPrivilege", propOrder = {"authorizationPrivilege"})
public class ArrayOfAuthorizationPrivilege {
  @XmlElement(name = "AuthorizationPrivilege")
  protected List<AuthorizationPrivilege> authorizationPrivilege;
  
  public List<AuthorizationPrivilege> getAuthorizationPrivilege() {
    if (this.authorizationPrivilege == null)
      this.authorizationPrivilege = new ArrayList<>(); 
    return this.authorizationPrivilege;
  }
}
