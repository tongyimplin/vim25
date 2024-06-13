package com.vmware.vim25;

import com.vmware.vim25.EventCategory;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "EventCategory")
@XmlEnum
public enum EventCategory {
  INFO("info"),
  WARNING("warning"),
  ERROR("error"),
  USER("user");
  
  private final String value;
  
  EventCategory(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static EventCategory fromValue(String paramString) {
    for (EventCategory eventCategory : values()) {
      if (eventCategory.value.equals(paramString))
        return eventCategory; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
