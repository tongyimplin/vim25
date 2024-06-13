package com.vmware.vim25;

import com.vmware.vim25.AlarmCreatedEvent;
import com.vmware.vim25.AlarmEvent;
import com.vmware.vim25.ManagedEntityEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmCreatedEvent", propOrder = {"entity"})
public class AlarmCreatedEvent extends AlarmEvent {
  @XmlElement(required = true)
  protected ManagedEntityEventArgument entity;
  
  public ManagedEntityEventArgument getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedEntityEventArgument paramManagedEntityEventArgument) {
    this.entity = paramManagedEntityEventArgument;
  }
}
