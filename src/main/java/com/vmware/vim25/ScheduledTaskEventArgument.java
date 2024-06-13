package com.vmware.vim25;

import com.vmware.vim25.EntityEventArgument;
import com.vmware.vim25.ManagedObjectReference;
import com.vmware.vim25.ScheduledTaskEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledTaskEventArgument", propOrder = {"scheduledTask"})
public class ScheduledTaskEventArgument extends EntityEventArgument {
  @XmlElement(required = true)
  protected ManagedObjectReference scheduledTask;
  
  public ManagedObjectReference getScheduledTask() {
    return this.scheduledTask;
  }
  
  public void setScheduledTask(ManagedObjectReference paramManagedObjectReference) {
    this.scheduledTask = paramManagedObjectReference;
  }
}
