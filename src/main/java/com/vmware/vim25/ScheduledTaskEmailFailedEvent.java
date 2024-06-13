package com.vmware.vim25;

import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ScheduledTaskEmailFailedEvent;
import com.vmware.vim25.ScheduledTaskEvent;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ScheduledTaskEmailFailedEvent", propOrder = {"to", "reason"})
public class ScheduledTaskEmailFailedEvent extends ScheduledTaskEvent {
  @XmlElement(required = true)
  protected String to;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault reason;
  
  public String getTo() {
    return this.to;
  }
  
  public void setTo(String paramString) {
    this.to = paramString;
  }
  
  public LocalizedMethodFault getReason() {
    return this.reason;
  }
  
  public void setReason(LocalizedMethodFault paramLocalizedMethodFault) {
    this.reason = paramLocalizedMethodFault;
  }
}
