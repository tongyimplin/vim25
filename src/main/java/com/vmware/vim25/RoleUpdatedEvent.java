package com.vmware.vim25;

import com.vmware.vim25.RoleEvent;
import com.vmware.vim25.RoleUpdatedEvent;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoleUpdatedEvent", propOrder = {"privilegeList", "prevRoleName", "privilegesAdded", "privilegesRemoved"})
public class RoleUpdatedEvent extends RoleEvent {
  protected List<String> privilegeList;
  
  protected String prevRoleName;
  
  protected List<String> privilegesAdded;
  
  protected List<String> privilegesRemoved;
  
  public List<String> getPrivilegeList() {
    if (this.privilegeList == null)
      this.privilegeList = new ArrayList<>(); 
    return this.privilegeList;
  }
  
  public String getPrevRoleName() {
    return this.prevRoleName;
  }
  
  public void setPrevRoleName(String paramString) {
    this.prevRoleName = paramString;
  }
  
  public List<String> getPrivilegesAdded() {
    if (this.privilegesAdded == null)
      this.privilegesAdded = new ArrayList<>(); 
    return this.privilegesAdded;
  }
  
  public List<String> getPrivilegesRemoved() {
    if (this.privilegesRemoved == null)
      this.privilegesRemoved = new ArrayList<>(); 
    return this.privilegesRemoved;
  }
}
