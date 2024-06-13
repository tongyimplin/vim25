package com.vmware.vim25;

import com.vmware.vim25.AlarmFilterSpecAlarmTypeByTrigger;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "AlarmFilterSpecAlarmTypeByTrigger")
@XmlEnum
public enum AlarmFilterSpecAlarmTypeByTrigger {
  TRIGGER_TYPE_ALL("triggerTypeAll"),
  TRIGGER_TYPE_EVENT("triggerTypeEvent"),
  TRIGGER_TYPE_METRIC("triggerTypeMetric");
  
  private final String value;
  
  AlarmFilterSpecAlarmTypeByTrigger(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static AlarmFilterSpecAlarmTypeByTrigger fromValue(String paramString) {
    for (AlarmFilterSpecAlarmTypeByTrigger alarmFilterSpecAlarmTypeByTrigger : values()) {
      if (alarmFilterSpecAlarmTypeByTrigger.value.equals(paramString))
        return alarmFilterSpecAlarmTypeByTrigger; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
