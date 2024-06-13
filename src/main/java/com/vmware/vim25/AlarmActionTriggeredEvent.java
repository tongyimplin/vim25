package com.vmware.vim25;

import com.vmware.vim25.AlarmActionTriggeredEvent;
import com.vmware.vim25.AlarmEvent;
import com.vmware.vim25.ManagedEntityEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmActionTriggeredEvent", propOrder = {"source", "entity"})
public class AlarmActionTriggeredEvent extends AlarmEvent {
  @XmlElement(required = true)
  protected ManagedEntityEventArgument source;
  
  @XmlElement(required = true)
  protected ManagedEntityEventArgument entity;
  
  public ManagedEntityEventArgument getSource() {
    return this.source;
  }
  
  public void setSource(ManagedEntityEventArgument paramManagedEntityEventArgument) {
    this.source = paramManagedEntityEventArgument;
  }
  
  public ManagedEntityEventArgument getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedEntityEventArgument paramManagedEntityEventArgument) {
    this.entity = paramManagedEntityEventArgument;
  }
}
