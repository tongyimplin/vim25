package com.vmware.vim25;

import com.vmware.vim25.Event;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.PostEventRequestType;
import com.vmware.vim25.TaskInfo;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PostEventRequestType", propOrder = {"_this", "eventToPost", "taskInfo"})
public class PostEventRequestType {
  @XmlElement(required = true)
  protected ManagedObjectReference _this;
  
  @XmlElement(required = true)
  protected Event eventToPost;
  
  protected TaskInfo taskInfo;
  
  public ManagedObjectReference getThis() {
    return this._this;
  }
  
  public void setThis(ManagedObjectReference paramManagedObjectReference) {
    this._this = paramManagedObjectReference;
  }
  
  public Event getEventToPost() {
    return this.eventToPost;
  }
  
  public void setEventToPost(Event paramEvent) {
    this.eventToPost = paramEvent;
  }
  
  public TaskInfo getTaskInfo() {
    return this.taskInfo;
  }
  
  public void setTaskInfo(TaskInfo paramTaskInfo) {
    this.taskInfo = paramTaskInfo;
  }
}
