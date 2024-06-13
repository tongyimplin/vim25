package com.vmware.vim25;

import com.vmware.vim25.PerfStatsType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PerfStatsType")
@XmlEnum
public enum PerfStatsType {
  ABSOLUTE("absolute"),
  DELTA("delta"),
  RATE("rate");
  
  private final String value;
  
  PerfStatsType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static PerfStatsType fromValue(String paramString) {
    for (PerfStatsType perfStatsType : values()) {
      if (perfStatsType.value.equals(paramString))
        return perfStatsType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
