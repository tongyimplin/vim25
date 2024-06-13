package com.vmware.vim25;

import com.vmware.vim25.TaskFilterSpecTimeOption;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "TaskFilterSpecTimeOption")
@XmlEnum
public enum TaskFilterSpecTimeOption {
  QUEUED_TIME("queuedTime"),
  STARTED_TIME("startedTime"),
  COMPLETED_TIME("completedTime");
  
  private final String value;
  
  TaskFilterSpecTimeOption(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static TaskFilterSpecTimeOption fromValue(String paramString) {
    for (TaskFilterSpecTimeOption taskFilterSpecTimeOption : values()) {
      if (taskFilterSpecTimeOption.value.equals(paramString))
        return taskFilterSpecTimeOption; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
