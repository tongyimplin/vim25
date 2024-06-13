package com.vmware.vim25;

import com.vmware.vim25.StateAlarmOperator;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "StateAlarmOperator")
@XmlEnum
public enum StateAlarmOperator {
  IS_EQUAL("isEqual"),
  IS_UNEQUAL("isUnequal");
  
  private final String value;
  
  StateAlarmOperator(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static StateAlarmOperator fromValue(String paramString) {
    for (StateAlarmOperator stateAlarmOperator : values()) {
      if (stateAlarmOperator.value.equals(paramString))
        return stateAlarmOperator; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
