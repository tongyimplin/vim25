package com.vmware.vim25;

import com.vmware.vim25.AlarmEmailCompletedEvent;
import com.vmware.vim25.AlarmEvent;
import com.vmware.vim25.ManagedEntityEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmEmailCompletedEvent", propOrder = {"entity", "to"})
public class AlarmEmailCompletedEvent extends AlarmEvent {
  @XmlElement(required = true)
  protected ManagedEntityEventArgument entity;
  
  @XmlElement(required = true)
  protected String to;
  
  public ManagedEntityEventArgument getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedEntityEventArgument paramManagedEntityEventArgument) {
    this.entity = paramManagedEntityEventArgument;
  }
  
  public String getTo() {
    return this.to;
  }
  
  public void setTo(String paramString) {
    this.to = paramString;
  }
}
