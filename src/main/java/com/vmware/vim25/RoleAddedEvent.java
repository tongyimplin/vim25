package com.vmware.vim25;

import com.vmware.vim25.RoleAddedEvent;
import com.vmware.vim25.RoleEvent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleAddedEvent", propOrder = {"privilegeList"})
public class RoleAddedEvent extends RoleEvent {
  protected List<String> privilegeList;
  
  public List<String> getPrivilegeList() {
    if (this.privilegeList == null)
      this.privilegeList = new ArrayList<>(); 
    return this.privilegeList;
  }
}
