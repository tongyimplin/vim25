package com.vmware.vim25;

import com.vmware.vim25.TaskReason;
import com.vmware.vim25.TaskReasonUser;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskReasonUser", propOrder = {"userName"})
public class TaskReasonUser extends TaskReason {
  @XmlElement(required = true)
  protected String userName;
  
  public String getUserName() {
    return this.userName;
  }
  
  public void setUserName(String paramString) {
    this.userName = paramString;
  }
}
