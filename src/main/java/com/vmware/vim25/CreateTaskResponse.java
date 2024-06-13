package com.vmware.vim25;

import com.vmware.vim25.CreateTaskResponse;
import com.vmware.vim25.TaskInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"returnval"})
@XmlRootElement(name = "CreateTaskResponse")
public class CreateTaskResponse {
  @XmlElement(required = true)
  protected TaskInfo returnval;
  
  public TaskInfo getReturnval() {
    return this.returnval;
  }
  
  public void setReturnval(TaskInfo paramTaskInfo) {
    this.returnval = paramTaskInfo;
  }
}
