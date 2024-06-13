package com.vmware.vim25;

import com.vmware.vim25.MetricAlarmOperator;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "MetricAlarmOperator")
@XmlEnum
public enum MetricAlarmOperator {
  IS_ABOVE("isAbove"),
  IS_BELOW("isBelow");
  
  private final String value;
  
  MetricAlarmOperator(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static MetricAlarmOperator fromValue(String paramString) {
    for (MetricAlarmOperator metricAlarmOperator : values()) {
      if (metricAlarmOperator.value.equals(paramString))
        return metricAlarmOperator; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
