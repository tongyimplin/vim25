package com.vmware.vim25;

import com.vmware.vim25.DayOfWeek;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "DayOfWeek")
@XmlEnum
public enum DayOfWeek {
  SUNDAY("sunday"),
  MONDAY("monday"),
  TUESDAY("tuesday"),
  WEDNESDAY("wednesday"),
  THURSDAY("thursday"),
  FRIDAY("friday"),
  SATURDAY("saturday");
  
  private final String value;
  
  DayOfWeek(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static DayOfWeek fromValue(String paramString) {
    for (DayOfWeek dayOfWeek : values()) {
      if (dayOfWeek.value.equals(paramString))
        return dayOfWeek; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
