package com.vmware.vim25;

import com.vmware.vim25.AlarmEmailFailedEvent;
import com.vmware.vim25.AlarmEvent;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedEntityEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmEmailFailedEvent", propOrder = {"entity", "to", "reason"})
public class AlarmEmailFailedEvent extends AlarmEvent {
  @XmlElement(required = true)
  protected ManagedEntityEventArgument entity;
  
  @XmlElement(required = true)
  protected String to;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault reason;
  
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
  
  public LocalizedMethodFault getReason() {
    return this.reason;
  }
  
  public void setReason(LocalizedMethodFault paramLocalizedMethodFault) {
    this.reason = paramLocalizedMethodFault;
  }
}
