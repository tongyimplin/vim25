package com.vmware.vim25;

import com.vmware.vim25.ArrayOfTaskInfo;
import com.vmware.vim25.TaskInfo;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfTaskInfo", propOrder = {"taskInfo"})
public class ArrayOfTaskInfo {
  @XmlElement(name = "TaskInfo")
  protected List<TaskInfo> taskInfo;
  
  public List<TaskInfo> getTaskInfo() {
    if (this.taskInfo == null)
      this.taskInfo = new ArrayList<>(); 
    return this.taskInfo;
  }
}
