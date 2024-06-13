package com.vmware.vim25;

import com.vmware.vim25.TaskInfoState;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "TaskInfoState")
@XmlEnum
public enum TaskInfoState {
  QUEUED("queued"),
  RUNNING("running"),
  SUCCESS("success"),
  ERROR("error");
  
  private final String value;
  
  TaskInfoState(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static TaskInfoState fromValue(String paramString) {
    for (TaskInfoState taskInfoState : values()) {
      if (taskInfoState.value.equals(paramString))
        return taskInfoState; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
