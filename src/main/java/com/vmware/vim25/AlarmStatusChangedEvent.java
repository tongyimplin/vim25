package com.vmware.vim25;

import com.vmware.vim25.AlarmEvent;
import com.vmware.vim25.AlarmStatusChangedEvent;
import com.vmware.vim25.ManagedEntityEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmStatusChangedEvent", propOrder = {"source", "entity", "from", "to"})
public class AlarmStatusChangedEvent extends AlarmEvent {
  @XmlElement(required = true)
  protected ManagedEntityEventArgument source;
  
  @XmlElement(required = true)
  protected ManagedEntityEventArgument entity;
  
  @XmlElement(required = true)
  protected String from;
  
  @XmlElement(required = true)
  protected String to;
  
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
  
  public String getFrom() {
    return this.from;
  }
  
  public void setFrom(String paramString) {
    this.from = paramString;
  }
  
  public String getTo() {
    return this.to;
  }
  
  public void setTo(String paramString) {
    this.to = paramString;
  }
}
