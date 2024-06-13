package com.vmware.vim25;

import com.vmware.vim25.ScheduledTaskEmailCompletedEvent;
import com.vmware.vim25.ScheduledTaskEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledTaskEmailCompletedEvent", propOrder = {"to"})
public class ScheduledTaskEmailCompletedEvent extends ScheduledTaskEvent {
  @XmlElement(required = true)
  protected String to;
  
  public String getTo() {
    return this.to;
  }
  
  public void setTo(String paramString) {
    this.to = paramString;
  }
}
