package com.vmware.vim25;

import com.vmware.vim25.AlarmAcknowledgedEvent;
import com.vmware.vim25.AlarmActionTriggeredEvent;
import com.vmware.vim25.AlarmClearedEvent;
import com.vmware.vim25.AlarmCreatedEvent;
import com.vmware.vim25.AlarmEmailCompletedEvent;
import com.vmware.vim25.AlarmEmailFailedEvent;
import com.vmware.vim25.AlarmEvent;
import com.vmware.vim25.AlarmEventArgument;
import com.vmware.vim25.AlarmReconfiguredEvent;
import com.vmware.vim25.AlarmRemovedEvent;
import com.vmware.vim25.AlarmScriptCompleteEvent;
import com.vmware.vim25.AlarmScriptFailedEvent;
import com.vmware.vim25.AlarmSnmpCompletedEvent;
import com.vmware.vim25.AlarmSnmpFailedEvent;
import com.vmware.vim25.AlarmStatusChangedEvent;
import com.vmware.vim25.Event;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AlarmEvent", propOrder = {"alarm"})
@XmlSeeAlso({AlarmClearedEvent.class, AlarmActionTriggeredEvent.class, AlarmStatusChangedEvent.class, AlarmSnmpCompletedEvent.class, AlarmCreatedEvent.class, AlarmSnmpFailedEvent.class, AlarmAcknowledgedEvent.class, AlarmScriptFailedEvent.class, AlarmScriptCompleteEvent.class, AlarmReconfiguredEvent.class, AlarmRemovedEvent.class, AlarmEmailCompletedEvent.class, AlarmEmailFailedEvent.class})
public class AlarmEvent extends Event {
  @XmlElement(required = true)
  protected AlarmEventArgument alarm;
  
  public AlarmEventArgument getAlarm() {
    return this.alarm;
  }
  
  public void setAlarm(AlarmEventArgument paramAlarmEventArgument) {
    this.alarm = paramAlarmEventArgument;
  }
}
