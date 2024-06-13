package com.vmware.vim25;

import com.vmware.vim25.Event;
import com.vmware.vim25.TaskEvent;
import com.vmware.vim25.TaskInfo;
import com.vmware.vim25.TaskTimeoutEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskEvent", propOrder = {"info"})
@XmlSeeAlso({TaskTimeoutEvent.class})
public class TaskEvent extends Event {
  @XmlElement(required = true)
  protected TaskInfo info;
  
  public TaskInfo getInfo() {
    return this.info;
  }
  
  public void setInfo(TaskInfo paramTaskInfo) {
    this.info = paramTaskInfo;
  }
}
