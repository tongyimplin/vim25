package com.vmware.vim25;

import com.vmware.vim25.Event;
import com.vmware.vim25.ManagedEntityEventArgument;
import com.vmware.vim25.ScheduledTaskCompletedEvent;
import com.vmware.vim25.ScheduledTaskCreatedEvent;
import com.vmware.vim25.ScheduledTaskEmailCompletedEvent;
import com.vmware.vim25.ScheduledTaskEmailFailedEvent;
import com.vmware.vim25.ScheduledTaskEvent;
import com.vmware.vim25.ScheduledTaskEventArgument;
import com.vmware.vim25.ScheduledTaskFailedEvent;
import com.vmware.vim25.ScheduledTaskReconfiguredEvent;
import com.vmware.vim25.ScheduledTaskRemovedEvent;
import com.vmware.vim25.ScheduledTaskStartedEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledTaskEvent", propOrder = {"scheduledTask", "entity"})
@XmlSeeAlso({ScheduledTaskReconfiguredEvent.class, ScheduledTaskFailedEvent.class, ScheduledTaskRemovedEvent.class, ScheduledTaskEmailCompletedEvent.class, ScheduledTaskStartedEvent.class, ScheduledTaskEmailFailedEvent.class, ScheduledTaskCreatedEvent.class, ScheduledTaskCompletedEvent.class})
public class ScheduledTaskEvent extends Event {
  @XmlElement(required = true)
  protected ScheduledTaskEventArgument scheduledTask;
  
  @XmlElement(required = true)
  protected ManagedEntityEventArgument entity;
  
  public ScheduledTaskEventArgument getScheduledTask() {
    return this.scheduledTask;
  }
  
  public void setScheduledTask(ScheduledTaskEventArgument paramScheduledTaskEventArgument) {
    this.scheduledTask = paramScheduledTaskEventArgument;
  }
  
  public ManagedEntityEventArgument getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedEntityEventArgument paramManagedEntityEventArgument) {
    this.entity = paramManagedEntityEventArgument;
  }
}
