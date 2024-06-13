package com.vmware.vim25;

import com.vmware.vim25.EventFilterSpecRecursionOption;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "EventFilterSpecRecursionOption")
@XmlEnum
public enum EventFilterSpecRecursionOption {
  SELF("self"),
  CHILDREN("children"),
  ALL("all");
  
  private final String value;
  
  EventFilterSpecRecursionOption(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static EventFilterSpecRecursionOption fromValue(String paramString) {
    for (EventFilterSpecRecursionOption eventFilterSpecRecursionOption : values()) {
      if (eventFilterSpecRecursionOption.value.equals(paramString))
        return eventFilterSpecRecursionOption; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
