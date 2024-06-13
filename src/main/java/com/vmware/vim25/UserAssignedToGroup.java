package com.vmware.vim25;

import com.vmware.vim25.HostEvent;
import com.vmware.vim25.UserAssignedToGroup;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UserAssignedToGroup", propOrder = {"userLogin", "group"})
public class UserAssignedToGroup extends HostEvent {
  @XmlElement(required = true)
  protected String userLogin;
  
  @XmlElement(required = true)
  protected String group;
  
  public String getUserLogin() {
    return this.userLogin;
  }
  
  public void setUserLogin(String paramString) {
    this.userLogin = paramString;
  }
  
  public String getGroup() {
    return this.group;
  }
  
  public void setGroup(String paramString) {
    this.group = paramString;
  }
}
