package com.vmware.vim25;

import com.vmware.vim25.PerfSummaryType;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "PerfSummaryType")
@XmlEnum
public enum PerfSummaryType {
  AVERAGE("average"),
  MAXIMUM("maximum"),
  MINIMUM("minimum"),
  LATEST("latest"),
  SUMMATION("summation"),
  NONE("none");
  
  private final String value;
  
  PerfSummaryType(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static PerfSummaryType fromValue(String paramString) {
    for (PerfSummaryType perfSummaryType : values()) {
      if (perfSummaryType.value.equals(paramString))
        return perfSummaryType; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
