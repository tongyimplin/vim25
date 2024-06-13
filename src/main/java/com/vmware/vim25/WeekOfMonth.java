package com.vmware.vim25;

import com.vmware.vim25.WeekOfMonth;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "WeekOfMonth")
@XmlEnum
public enum WeekOfMonth {
  FIRST("first"),
  SECOND("second"),
  THIRD("third"),
  FOURTH("fourth"),
  LAST("last");
  
  private final String value;
  
  WeekOfMonth(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static WeekOfMonth fromValue(String paramString) {
    for (WeekOfMonth weekOfMonth : values()) {
      if (weekOfMonth.value.equals(paramString))
        return weekOfMonth; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
