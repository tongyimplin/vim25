package com.vmware.vim25;

import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.TaskReason;
import com.vmware.vim25.TaskReasonSchedule;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaskReasonSchedule", propOrder = {"name", "scheduledTask"})
public class TaskReasonSchedule extends TaskReason {
  @XmlElement(required = true)
  protected String name;
  
  @XmlElement(required = true)
  protected ManagedObjectReference scheduledTask;
  
  public String getName() {
    return this.name;
  }
  
  public void setName(String paramString) {
    this.name = paramString;
  }
  
  public ManagedObjectReference getScheduledTask() {
    return this.scheduledTask;
  }
  
  public void setScheduledTask(ManagedObjectReference paramManagedObjectReference) {
    this.scheduledTask = paramManagedObjectReference;
  }
}
