package com.vmware.vim25;

import com.vmware.vim25.Action;
import com.vmware.vim25.CreateTaskAction;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CreateTaskAction", propOrder = {"taskTypeId", "cancelable"})
public class CreateTaskAction extends Action {
  @XmlElement(required = true)
  protected String taskTypeId;
  
  protected boolean cancelable;
  
  public String getTaskTypeId() {
    return this.taskTypeId;
  }
  
  public void setTaskTypeId(String paramString) {
    this.taskTypeId = paramString;
  }
  
  public boolean isCancelable() {
    return this.cancelable;
  }
  
  public void setCancelable(boolean paramBoolean) {
    this.cancelable = paramBoolean;
  }
}
