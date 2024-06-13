package com.vmware.vim25;

import com.vmware.vim25.EventEventSeverity;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "EventEventSeverity")
@XmlEnum
public enum EventEventSeverity {
  ERROR("error"),
  WARNING("warning"),
  INFO("info"),
  USER("user");
  
  private final String value;
  
  EventEventSeverity(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static EventEventSeverity fromValue(String paramString) {
    for (EventEventSeverity eventEventSeverity : values()) {
      if (eventEventSeverity.value.equals(paramString))
        return eventEventSeverity; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
