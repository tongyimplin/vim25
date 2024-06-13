package com.vmware.vim25;

import com.vmware.vim25.ActionParameter;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ActionParameter")
@XmlEnum
public enum ActionParameter {
  TARGET_NAME("targetName"),
  ALARM_NAME("alarmName"),
  OLD_STATUS("oldStatus"),
  NEW_STATUS("newStatus"),
  TRIGGERING_SUMMARY("triggeringSummary"),
  DECLARING_SUMMARY("declaringSummary"),
  EVENT_DESCRIPTION("eventDescription"),
  TARGET("target"),
  ALARM("alarm");
  
  private final String value;
  
  ActionParameter(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ActionParameter fromValue(String paramString) {
    for (ActionParameter actionParameter : values()) {
      if (actionParameter.value.equals(paramString))
        return actionParameter; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
