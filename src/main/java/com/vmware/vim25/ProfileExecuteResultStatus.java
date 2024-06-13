package com.vmware.vim25;

import com.vmware.vim25.ProfileExecuteResultStatus;
import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;

@XmlType(name = "ProfileExecuteResultStatus")
@XmlEnum
public enum ProfileExecuteResultStatus {
  SUCCESS("success"),
  NEED_INPUT("needInput"),
  ERROR("error");
  
  private final String value;
  
  ProfileExecuteResultStatus(String paramString1) {
    this.value = paramString1;
  }
  
  public String value() {
    return this.value;
  }
  
  public static ProfileExecuteResultStatus fromValue(String paramString) {
    for (ProfileExecuteResultStatus profileExecuteResultStatus : values()) {
      if (profileExecuteResultStatus.value.equals(paramString))
        return profileExecuteResultStatus; 
    } 
    throw new IllegalArgumentException(paramString);
  }
}
