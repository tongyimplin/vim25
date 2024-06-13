package com.vmware.vim25;

import com.vmware.vim25.PerfFormat;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PerfFormat")
@XmlEnum
public enum PerfFormat {
  NORMAL("normal"),
  CSV("csv");
  
  private final String value;
  
  PerfFormat(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static PerfFormat fromValue(String paramString) {
    for (PerfFormat perfFormat : values()) {
      if (perfFormat.value.equals(paramString))
        return perfFormat; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
