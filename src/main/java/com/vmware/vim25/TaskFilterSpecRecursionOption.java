package com.vmware.vim25;

import com.vmware.vim25.TaskFilterSpecRecursionOption;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "TaskFilterSpecRecursionOption")
@XmlEnum
public enum TaskFilterSpecRecursionOption {
  SELF("self"),
  CHILDREN("children"),
  ALL("all");
  
  private final String value;
  
  TaskFilterSpecRecursionOption(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static TaskFilterSpecRecursionOption fromValue(String paramString) {
    for (TaskFilterSpecRecursionOption taskFilterSpecRecursionOption : values()) {
      if (taskFilterSpecRecursionOption.value.equals(paramString))
        return taskFilterSpecRecursionOption; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
