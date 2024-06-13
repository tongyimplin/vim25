package com.vmware.vim25;

import com.vmware.vim25.ArrayOfAuthorizationRole;
import com.vmware.vim25.AuthorizationRole;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfAuthorizationRole", propOrder = {"authorizationRole"})
public class ArrayOfAuthorizationRole {
  @XmlElement(name = "AuthorizationRole")
  protected List<AuthorizationRole> authorizationRole;
  
  public List<AuthorizationRole> getAuthorizationRole() {
    if (this.authorizationRole == null)
      this.authorizationRole = new ArrayList<>(); 
    return this.authorizationRole;
  }
}
