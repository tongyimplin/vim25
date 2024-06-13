package com.vmware.vim25;

import com.vmware.vim25.AlarmEvent;
import com.vmware.vim25.AlarmSnmpFailedEvent;
import com.vmware.vim25.LocalizedMethodFault;
import com.vmware.vim25.ManagedEntityEventArgument;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmSnmpFailedEvent", propOrder = {"entity", "reason"})
public class AlarmSnmpFailedEvent extends AlarmEvent {
  @XmlElement(required = true)
  protected ManagedEntityEventArgument entity;
  
  @XmlElement(required = true)
  protected LocalizedMethodFault reason;
  
  public ManagedEntityEventArgument getEntity() {
    return this.entity;
  }
  
  public void setEntity(ManagedEntityEventArgument paramManagedEntityEventArgument) {
    this.entity = paramManagedEntityEventArgument;
  }
  
  public LocalizedMethodFault getReason() {
    return this.reason;
  }
  
  public void setReason(LocalizedMethodFault paramLocalizedMethodFault) {
    this.reason = paramLocalizedMethodFault;
  }
}
