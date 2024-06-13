package com.vmware.vim25;

import com.vmware.vim25.AuthorizationDescription;
import com.vmware.vim25.DynamicData;
import com.vmware.vim25.ElementDescription;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AuthorizationDescription", propOrder = {"privilege", "privilegeGroup"})
public class AuthorizationDescription extends DynamicData {
  @XmlElement(required = true)
  protected List<ElementDescription> privilege;
  
  @XmlElement(required = true)
  protected List<ElementDescription> privilegeGroup;
  
  public List<ElementDescription> getPrivilege() {
    if (this.privilege == null)
      this.privilege = new ArrayList<>(); 
    return this.privilege;
  }
  
  public List<ElementDescription> getPrivilegeGroup() {
    if (this.privilegeGroup == null)
      this.privilegeGroup = new ArrayList<>(); 
    return this.privilegeGroup;
  }
}
