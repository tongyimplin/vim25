package com.vmware.vim25;

import com.vmware.vim25.EventAlarmExpressionComparisonOperator;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "EventAlarmExpressionComparisonOperator")
@XmlEnum
public enum EventAlarmExpressionComparisonOperator {
  EQUALS("equals"),
  NOT_EQUAL_TO("notEqualTo"),
  STARTS_WITH("startsWith"),
  DOES_NOT_START_WITH("doesNotStartWith"),
  ENDS_WITH("endsWith"),
  DOES_NOT_END_WITH("doesNotEndWith");
  
  private final String value;
  
  EventAlarmExpressionComparisonOperator(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static EventAlarmExpressionComparisonOperator fromValue(String paramString) {
    for (EventAlarmExpressionComparisonOperator eventAlarmExpressionComparisonOperator : values()) {
      if (eventAlarmExpressionComparisonOperator.value.equals(paramString))
        return eventAlarmExpressionComparisonOperator; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
