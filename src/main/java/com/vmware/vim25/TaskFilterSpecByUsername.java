package com.vmware.vim25;

import com.vmware.vim25.DynamicData;
import com.vmware.vim25.TaskFilterSpecByUsername;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskFilterSpecByUsername", propOrder = {"systemUser", "userList"})
public class TaskFilterSpecByUsername extends DynamicData {
  protected boolean systemUser;
  
  protected List<String> userList;
  
  public boolean isSystemUser() {
    return this.systemUser;
  }
  
  public void setSystemUser(boolean paramBoolean) {
    this.systemUser = paramBoolean;
  }
  
  public List<String> getUserList() {
    if (this.userList == null)
      this.userList = new ArrayList<>(); 
    return this.userList;
  }
}
